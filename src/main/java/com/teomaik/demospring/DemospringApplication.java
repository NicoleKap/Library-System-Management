package com.teomaik.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringApplication.class, args);
		
		// Θέλουμε να κάνουμε διαθέσιμες τις λειτουργίες (add, Remove κλπ) μέσω APIs και όχι μόνι μλεσω κονσόλας
		// Σε αυτό βοηθάει το Spring Framework για την μετατροπή λειτουργιών σε REST APIs
		
		
	}

}
