package com.emplifier.injestcv;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@PostMapping("/cv")
	public String receiveCv(@RequestBody String cvData) {
        System.out.println("Mottaget CV: " + cvData);
		// Hantera mottagen CV-data här
		return "CV mottagen";
	}
}
