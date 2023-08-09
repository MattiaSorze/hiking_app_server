package com.hikingapp.dto.model;

import java.util.List;

public class StartupSettingsTO {

	List<CountryTO> countryList;
	List<RegionTO> regionList;
	List<String> statusList;
	
	public StartupSettingsTO(List<CountryTO> countryList, List<RegionTO> regionList, List<String> statusList) {
		super();
		this.countryList = countryList;
		this.regionList = regionList;
		this.statusList = statusList;
	}

	public List<CountryTO> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<CountryTO> countryList) {
		this.countryList = countryList;
	}

	public List<RegionTO> getRegionList() {
		return regionList;
	}

	public void setRegionList(List<RegionTO> regionList) {
		this.regionList = regionList;
	}

	public List<String> getStatusList() {
		return statusList;
	}

	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}
}
