package com.hikingapp.service;

import java.util.ArrayList;
import java.util.List;

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
				GpxDataTO gpxDataTO = HikingDataFactory.deserializeGpxDataTO(singleHiking.getGpxData());
				singleHikingTO.setGpxData(gpxDataTO);
			}
			catch(Exception e) {
				
			}
			hikingDataTOList.add(singleHikingTO);
		}
		return hikingDataTOList;
	}
	
	public void saveHikingData(HikingDataTO hikingDataTO) {
		HikingData hikingData = HikingDataFactory.createHikingDataEntityFromTO(hikingDataTO);
		hikingDataRepo.save(hikingData);
	}
	
	public void deleteHikingDataFromId(Long id) {
		hikingDataRepo.deleteById(id);
	}
}
