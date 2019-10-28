package com.adp.interview.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Component
public class ParkingLot implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	public long id;
	
	@Column
	public String number;
	
	@Column
	public String type;
	
	@Column
	public double rate = 2.00;
	
}
