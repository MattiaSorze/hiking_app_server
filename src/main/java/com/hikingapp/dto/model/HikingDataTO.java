package com.hikingapp.dto.model;

import java.util.Date;

public class HikingDataTO {

	private Long id;
	private String name;
	private String region;
	private String country;
	private Date hikingDate;
	private String status;
	private GpxDataTO gpxData;

	public HikingDataTO() {
		super();
	}
	
	public HikingDataTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getHikingDate() {
		return hikingDate;
	}

	public void setHikingDate(Date hikingDate) {
		this.hikingDate = hikingDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public GpxDataTO getGpxData() {
		return gpxData;
	}

	public void setGpxData(GpxDataTO gpxData) {
		this.gpxData = gpxData;
	}
}
