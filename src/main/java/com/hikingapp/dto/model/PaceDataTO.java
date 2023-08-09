package com.hikingapp.dto.model;

import java.io.Serializable;
import java.util.Date;

public class PaceDataTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double pace;
	private Date time;
	
	public PaceDataTO(Double pace, Date time) {
		super();
		this.pace = pace;
		this.time = time;
	}
	
	public Double getPace() {
		return pace;
	}
	public void setPace(Double pace) {
		this.pace = pace;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
