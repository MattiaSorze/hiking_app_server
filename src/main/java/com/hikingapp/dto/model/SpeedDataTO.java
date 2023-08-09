package com.hikingapp.dto.model;

import java.io.Serializable;
import java.util.Date;

public class SpeedDataTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double speed;
	private Date time;
	
	public SpeedDataTO(Double speed, Date time) {
		super();
		this.speed = speed;
		this.time = time;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
