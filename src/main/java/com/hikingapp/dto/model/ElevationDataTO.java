package com.hikingapp.dto.model;

import java.io.Serializable;
import java.util.Date;

public class ElevationDataTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double elevation;
	private Date time;
	
	public ElevationDataTO(Double elevation, Date time) {
		super();
		this.elevation = elevation;
		this.time = time;
	}
	
	public Double getElevation() {
		return elevation;
	}
	public void setElevation(Double elevation) {
		this.elevation = elevation;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
