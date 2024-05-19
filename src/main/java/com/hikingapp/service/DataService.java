package com.hikingapp.service;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hikingapp.dto.model.GpxDataTO;
import com.hikingapp.dto.model.HikingDataTO;
import com.hikingapp.factories.HikingDataFactory;
import com.hikingapp.persistence.model.HikingData;
import com.hikingapp.persistence.repository.HikingDataRepository;
import com.google.gson.Gson;

@Service
public class DataService {

	@Autowired
	HikingDataRepository hikingDataRepo;

	private static final Logger logger = LoggerFactory.getLogger(DataService.class);
	
	public List<HikingDataTO> getHikingData(){
		List<HikingData> hikingDataList = hikingDataRepo.getHikingData();
		List<HikingDataTO> hikingDataTOList = new ArrayList<>();
		Gson gson = new Gson();
		
		for(HikingData singleHiking : hikingDataList) {
			HikingDataTO singleHikingTO = new HikingDataTO();
			singleHikingTO.setId(singleHiking.getId());
			singleHikingTO.setName(singleHiking.getName());
			singleHikingTO.setCountry(singleHiking.getCountry());
			singleHikingTO.setRegion(singleHiking.getRegion());
			singleHikingTO.setStatus(singleHiking.getStatus());
			singleHikingTO.setHikingDate(singleHiking.getHikingDate());
			try {
				GpxDataTO gpxDataTO = (GpxDataTO)HikingDataFactory.deserializeGpxDataTO(singleHiking.getGpxData());
				singleHikingTO.setGpxData(gpxDataTO);
			}
			catch(Exception e) {
				
			}
			try{
				ObjectMapper objectMapper = new ObjectMapper();
				List<byte[]> binaryDataList = objectMapper.readValue(singleHiking.getImageData(), new TypeReference<List<byte[]>>() {});
				List<String> imageData = HikingDataFactory.deserializeImageData(binaryDataList);
				singleHikingTO.setImageData(imageData);
			}
			catch(Exception e){
				logger.error(e.getMessage());
			}
			hikingDataTOList.add(singleHikingTO);
		}
		return hikingDataTOList;
	}
	
	public void saveHikingData(HikingDataTO hikingDataTO) {
		HikingData hikingData = HikingDataFactory.createHikingDataEntityFromTO(hikingDataTO);
		hikingDataRepo.save(hikingData);
	}
	
	public List<HikingDataTO> deleteHikingDataFromId(Long id) {
		hikingDataRepo.deleteById(id);
		return getHikingData();
	}
}
