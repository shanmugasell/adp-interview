package com.adp.interview.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ParkingLot {
	
	public long id;
	
	public String number;
	
	public String type;
	
	public double rate = 2.00;
	
}
