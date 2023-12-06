package com.example.personsaccount;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/gone")
public class Averageapplications {
	@GetMapping(path="/roof")
	public String getname(){
  return "I am immportal";
}
}
