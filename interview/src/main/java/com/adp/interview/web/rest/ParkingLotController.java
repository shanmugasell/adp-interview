package com.adp.interview.web.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parking")
public class ParkingLotController {
	
	@GetMapping("/get-parking-lots")
	public ResponseEntity<List<String>> getParkingLots() {
		List<String> list = new ArrayList<String>();
		list.add("Shanmugam");
		list.add("Shanmugam1");
		list.add("Shanmugam2");
		list.add("Shanmugam3");
		list.add("Shanmugam4");
		return ResponseEntity.ok(list);
	}

}
