package com.hikingapp.factories;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.hikingapp.dto.model.GpxDataTO;
import com.hikingapp.dto.model.HikingDataTO;
import com.hikingapp.persistence.model.HikingData;
import com.google.gson.Gson;

public class HikingDataFactory {

	public static HikingData createHikingDataEntityFromTO(HikingDataTO hikingDataTO) {
		Gson gson = new Gson();
		HikingData hikingDataEntity = new HikingData();
		hikingDataEntity.setId(hikingDataTO.getId());
		hikingDataEntity.setName(hikingDataTO.getName());
		hikingDataEntity.setRegion(hikingDataTO.getRegion());
		hikingDataEntity.setCountry(hikingDataTO.getCountry());
		hikingDataEntity.setHikingDate(hikingDataTO.getHikingDate());
		hikingDataEntity.setStatus(hikingDataTO.getStatus());
		try {
			hikingDataEntity.setGpxData(serializeGpxDataTO(hikingDataTO.getGpxData()));
		}
		catch(Exception e) {
			
		}
		try{
			hikingDataEntity.setImageData(serializeGpxDataTO(hikingDataTO.getImageData()));
		}
		catch(Exception e){

		}
		
		return hikingDataEntity;
	}
	
	public static byte[] serializeGpxDataTO(Object gpxDataTO) throws IOException {
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    ObjectOutputStream oos = new ObjectOutputStream(baos);
	    oos.writeObject(gpxDataTO);
	    oos.close();
	    return baos.toByteArray();
	}

	public static Object deserializeGpxDataTO(byte[] bytes) throws IOException, ClassNotFoundException {
	    ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
	    ObjectInputStream ois = new ObjectInputStream(bais);
	    Object gpxDataTO = ois.readObject();
	    ois.close();
	    return gpxDataTO;
	}
}
