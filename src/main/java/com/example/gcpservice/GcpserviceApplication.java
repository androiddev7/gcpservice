package com.example.gcpservice;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.auth.oauth2.GoogleCredentials;

@SpringBootApplication
@RestController
public class GcpserviceApplication {

	public static void main(String[] args) {
		/*
		 * try { GoogleCredentials creds = GoogleCredentials.getApplicationDefault(); }
		 * catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		SpringApplication.run(GcpserviceApplication.class, args);
	}

	
	@GetMapping(path = "/firstGCPCall")
	public String myfirstGCPService() {return "Hey There ! I am deployed on GCP";}
}

