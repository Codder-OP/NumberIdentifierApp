package com.springboot.app.NumberIdentifierApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.NumberIdentifierApi.service.IdentifierService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8080/")
public class IdentifierController {
	
	@Autowired
	private IdentifierService identifierservice;
	
	
	@GetMapping("/checknumber")
	public ResponseEntity<String> checkNumber(@RequestParam int number) {
		return new ResponseEntity<>(identifierservice.checkNumber(number),HttpStatus.OK);
	}

}
