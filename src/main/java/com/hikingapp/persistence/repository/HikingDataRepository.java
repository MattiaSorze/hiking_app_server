package com.hikingapp.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hikingapp.persistence.model.HikingData;

public interface HikingDataRepository extends HikingAppBaseRepositoryCustom<HikingData, Long>{

	@Query("select hd from HikingData hd")
	public List<HikingData> getHikingData();
	
	@Query("delete from HikingData hd where hd.id=:id")
	public void deleteHikingDataFromId(@Param("id") Long id);
	
}
