package com.hikingapp.persistence.model;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.JdbcType;
import org.hibernate.annotations.Type;
import org.hibernate.type.descriptor.jdbc.VarbinaryJdbcType;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "HIKING_DATA")
public class HikingData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="HIKING_DATA_ID_GENERATOR", sequenceName="HIKING_DATA_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HIKING_DATA_ID_GENERATOR")
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "region")
	private String region;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "hiking_date")
	private Date hikingDate;
	
	@Column(name = "status")
	private String status;
	
	@JdbcType(VarbinaryJdbcType.class)
	@Column(name = "gpx_data")
	private byte[] gpxData;

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

	public byte[] getGpxData() {
		return gpxData;
	}

	public void setGpxData(byte[] gpxData) {
		this.gpxData = gpxData;
	}
}
