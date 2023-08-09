package com.hikingapp.dto.model;

import java.util.ArrayList;
import java.util.List;

import com.hikingapp.constants.CountryValues;

public class CountryTO {
	
	private String code;
	private String label;
	private String phone;
	
	public CountryTO(String code, String label, String phone) {
		super();
		this.code = code;
		this.label = label;
		this.phone = phone;
	}
	
	public static List<CountryTO> createCountryList() {
		List<CountryTO> countryList = new ArrayList<>();
		for(CountryValues value : CountryValues.values()) {
			CountryTO country = new CountryTO(value.getCode(), value.getLabel(), value.getPhone());
			countryList.add(country);
		}
		return countryList;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
