package com.hikingapp.dto.model;

import java.util.ArrayList;
import java.util.List;

import com.hikingapp.constants.RegionValues;

public class RegionTO {

	private String label;

	public RegionTO(String label) {
		super();
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	public static List<RegionTO> createRegionList(){
		List<RegionTO> regionList = new ArrayList<>();
		for(RegionValues value : RegionValues.values()) {
			RegionTO region = new RegionTO(value.getLabel());
			regionList.add(region);
		}
		return regionList;
	}
}
