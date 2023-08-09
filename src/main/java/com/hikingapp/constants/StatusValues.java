package com.hikingapp.constants;

import java.util.ArrayList;
import java.util.List;

public enum StatusValues {

	PLANNED("Planned"),
	COMPLETED("Completed");
	
	private String status;
	
	private StatusValues(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public static List<String> getStatusList(){
		List<String> statusList = new ArrayList<>();
		
		for(StatusValues value : StatusValues.values()) {
			statusList.add(value.getStatus());
		}
		
		return statusList;
	}
}
