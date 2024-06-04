package com.example.ChronicleMapSample;

import net.openhft.chronicle.map.ChronicleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChronicleMapSampleApplication implements CommandLineRunner {
	@Autowired
	private ChronicleMap<Long, String> chronicleMap;

	public static void main(String[] args) {
		SpringApplication.run(ChronicleMapSampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Put some data into the Chronicle Map
		chronicleMap.put(1L, "Hello");
		chronicleMap.put(2L, "World");

		// Retrieve data from the Chronicle Map
		String value1 = chronicleMap.get(1L);
		String value2 = chronicleMap.get(2L);

		System.out.println("Value for key 1: " + value1);
		System.out.println("Value for key 2: " + value2);
	}

}
