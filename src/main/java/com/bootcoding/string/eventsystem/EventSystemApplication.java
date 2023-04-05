package com.bootcoding.string.eventsystem;


import com.bootcoding.string.eventsystem.frigde.Fridge;
import com.bootcoding.string.eventsystem.frigde.FridgeService;
import com.bootcoding.string.eventsystem.laptop.Laptop;
import com.bootcoding.string.eventsystem.marker.Marker;
import com.bootcoding.string.eventsystem.marker.ValuesExample;
import com.bootcoding.string.eventsystem.patient.Patient;
import com.bootcoding.string.eventsystem.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@SpringBootApplication
public class EventSystemApplication implements ApplicationRunner {

	@Autowired
	private Marker marker;

	@Autowired
	private Laptop laptop;
	@Autowired
	private FridgeService fz;

	@Autowired
	private ValuesExample valuesExample;

	public static void main(String[] args) {
		SpringApplication.run(EventSystemApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
//		writeFile.fileWriter();
		List<Patient> patients = ps.createPatients(100);
		ps.writeToFile(patients);
		System.out.println("Dummy");
		List<Fridge> fridges = fz.createFridges(100);
		fz.writeToFile(fridges);
		System.out.println("Dummy");
	}

	@Autowired
	private PatientService ps;
}
