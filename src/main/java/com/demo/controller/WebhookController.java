package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {
	
	@RequestMapping("/api/webhook")
	@PostMapping
	public ResponseEntity<String> print(@RequestBody String requestBody){
		System.out.println("###### webHook ######"+requestBody);
		return new ResponseEntity<String>(requestBody,HttpStatus.OK);
		
	}
	
}
