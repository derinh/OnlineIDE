package edu.tum.ase.darkmode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DarkmodeApplication {

	// This variable holds the dark mode status
	private boolean darkModeEnabled = false;

	public static void main(String[] args) {
		SpringApplication.run(DarkmodeApplication.class, args);
	}

	// Endpoint to toggle dark mode
	@RequestMapping(path = "/dark-mode/toggle", method = RequestMethod.GET)
	public void toggleDarkMode() {
		// Toggle the dark mode status
		darkModeEnabled = !darkModeEnabled;
		System.out.println("Dark Mode toggled: " + darkModeEnabled);
	}

	// Endpoint to return dark mode status
	@RequestMapping(path = "/dark-mode/status", method = RequestMethod.GET)
	public boolean getDarkModeStatus() {
		return darkModeEnabled;
	}
}

