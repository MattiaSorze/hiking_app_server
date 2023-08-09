package com.hikingapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hikingapp.constants.StatusValues;
import com.hikingapp.dto.model.CountryTO;
import com.hikingapp.dto.model.RegionTO;
import com.hikingapp.dto.model.StartupSettingsTO;

@Service
public class SettingsService {
	
	public List<CountryTO> getCountryList(){
		List<CountryTO> countryList = CountryTO.createCountryList();
		return countryList;
	}
	
	public List<RegionTO> getRegionList(){
		List<RegionTO> regionList = RegionTO.createRegionList();
		return regionList;
	}

	public StartupSettingsTO getStartupSettings() {
		List<CountryTO> countryList = CountryTO.createCountryList();
		List<RegionTO> regionList = RegionTO.createRegionList();
		List<String> statusList = StatusValues.getStatusList();
		
		StartupSettingsTO settings = new StartupSettingsTO(countryList, regionList, statusList);
		return settings;
	}
}
