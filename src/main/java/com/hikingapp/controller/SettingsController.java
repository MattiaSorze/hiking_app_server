package com.hikingapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hikingapp.dto.model.CountryTO;
import com.hikingapp.dto.model.RegionTO;
import com.hikingapp.dto.model.StartupSettingsTO;
import com.hikingapp.service.SettingsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/hikingApp/rest/settings/")
public class SettingsController {
	
	@Autowired SettingsService settingsService;
	
	@GetMapping(value = "/loadCountries", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> loadCountries() throws Exception {
		List<CountryTO> countryList = settingsService.getCountryList();
		return ResponseEntity.ok().body(countryList);
	}
	
	@GetMapping(value = "loadRegions", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> loadRegions() throws Exception {
		List<RegionTO> regionList = settingsService.getRegionList();
		return ResponseEntity.ok().body(regionList);
	}
	
	@GetMapping(value = "loadSettings", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> loadSettings() throws Exception {
		StartupSettingsTO settings = settingsService.getStartupSettings();
		return ResponseEntity.ok().body(settings);
	}
}
