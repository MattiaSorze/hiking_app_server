package com.hikingapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hikingapp.dto.model.HikingDataTO;
import com.hikingapp.service.DataService;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

@RestController
@RequestMapping("hikingApp/rest/data/")
public class DataController {

	@Autowired
	DataService dataService;
	
	private Logger _logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value = "/loadHikingData", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> loadHikingData() throws Exception {
		List<HikingDataTO> hikingDataList = dataService.getHikingData();
		return ResponseEntity.ok().body(hikingDataList);
	}
	
	@PostMapping(value = "/saveHikingData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveHikingData(@RequestBody JsonNode hikingDataJsonNode) throws Exception {	
		try{
			Gson gson = new Gson();
			HikingDataTO hikingDataTO = new HikingDataTO();
			String hikingDataJson;
			if(hikingDataJsonNode != null) {
				hikingDataJson = hikingDataJsonNode.get("hikingData").toString();
				hikingDataTO = gson.fromJson(hikingDataJson, HikingDataTO.class);
			}
			dataService.saveHikingData(hikingDataTO);
		}
		catch(Exception e) {
			_logger.error("error while saving hiking data : \n" + e.getMessage(),e);
			throw new Exception(e.getMessage());
		}
		return ResponseEntity.ok().body(true);
	}
	
	@PostMapping(value = "/deleteHikingDataFromId/{id}")
	public ResponseEntity<?> deleteHikingDataFromId(@PathVariable("id") Long id) throws Exception {
		List<HikingDataTO> hikingData = new ArrayList<>();
		try {
			hikingData = dataService.deleteHikingDataFromId(id);
		}
		catch(Exception e) {
			_logger.error("error while deleting hiking data : \n" + e.getMessage(),e);
			throw new Exception(e.getMessage());
		}
		return ResponseEntity.ok().body(hikingData);
	}
}
