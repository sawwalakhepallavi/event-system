package com.bootcoding.string.eventsystem;

import com.bootcoding.string.eventsystem.file_handling.WriteFile;
import com.bootcoding.string.eventsystem.laptop.Laptop;
import com.bootcoding.string.eventsystem.marker.Marker;
import com.bootcoding.string.eventsystem.marker.ValuesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class EventSystemApplication implements ApplicationRunner {

	@Autowired
	private Marker marker;

	@Autowired
	private Laptop laptop;

	@Autowired
	private WriteFile writeFile;
	@Autowired
	private ValuesExample valuesExample;

	public static void main(String[] args) {
		SpringApplication.run(EventSystemApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		writeFile.fileWriter();
	}
}
