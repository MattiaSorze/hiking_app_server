package com.hikingapp.dto.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class GpxDataTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Double averageSpeed;
	private Date date;
	private Double distance;
	private Double duration;
	private List<ElevationDataTO> elevationData;
	private String fileName;
	private Double maxElevation;
	private Double minElevation;
	private List<PaceDataTO> paceData;
	private Double posElevation;
	private List<SpeedDataTO> speedData;
	private String title;
	
	public GpxDataTO(Double averageSpeed, Date date, Double distance, Double duration,
			List<ElevationDataTO> elevationData, String fileName, Double maxElevation, Double minElevation,
			List<PaceDataTO> paceData, Double posElevation, List<SpeedDataTO> speedData, String title) {
		super();
		this.averageSpeed = averageSpeed;
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.elevationData = elevationData;
		this.fileName = fileName;
		this.maxElevation = maxElevation;
		this.minElevation = minElevation;
		this.paceData = paceData;
		this.posElevation = posElevation;
		this.speedData = speedData;
		this.title = title;
	}

	public Double getAverageSpeed() {
		return averageSpeed;
	}

	public void setAverageSpeed(Double averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public List<ElevationDataTO> getElevationData() {
		return elevationData;
	}

	public void setElevationData(List<ElevationDataTO> elevationData) {
		this.elevationData = elevationData;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Double getMaxElevation() {
		return maxElevation;
	}

	public void setMaxElevation(Double maxElevation) {
		this.maxElevation = maxElevation;
	}

	public Double getMinElevation() {
		return minElevation;
	}

	public void setMinElevation(Double minElevation) {
		this.minElevation = minElevation;
	}

	public List<PaceDataTO> getPaceData() {
		return paceData;
	}

	public void setPaceData(List<PaceDataTO> paceData) {
		this.paceData = paceData;
	}

	public Double getPosElevation() {
		return posElevation;
	}

	public void setPosElevation(Double posElevation) {
		this.posElevation = posElevation;
	}

	public List<SpeedDataTO> getSpeedData() {
		return speedData;
	}

	public void setSpeedData(List<SpeedDataTO> speedData) {
		this.speedData = speedData;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
}
