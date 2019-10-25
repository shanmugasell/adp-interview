package com.adp.interview.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.adp.interview.entity.ParkingLot;
import com.adp.interview.repository.ParkingLotRepository;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {

	public ParkingLotRepository parkingLotRepository;
	
	public boolean saveParkingLots() {
		List<ParkingLot> entities = new ArrayList<ParkingLot>();
		for(int i=0; i<5; i++) {
			ParkingLot entity = new ParkingLot();
			entity.setNumber(""+i);
			entity.setType("P"+i);
			entity.setRate(2);
			entities.add(entity);
		}
		parkingLotRepository.saveAll(entities);
		
		return false;
	}

}
