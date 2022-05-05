package com.skillstorm.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.models.Author;

@RestController
@RequestMapping("/authors") // This will prefix all of of my method mappings to have /authors in front
public class AuthorController {
	
//	@RequestMapping(value = "/authors", method = RequestMethod.GET)
	@GetMapping
	public void findAll() {
		System.out.println("Inside findAll method");
	}
	
	@PostMapping
	public void save(@RequestBody Author author) {
		System.out.println(author);
	}
	
	@PutMapping
	public void update() {
		
	}
}
