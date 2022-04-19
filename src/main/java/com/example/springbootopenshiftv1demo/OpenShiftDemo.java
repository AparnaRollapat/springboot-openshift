package com.example.springbootopenshiftv1demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OpenShiftDemo {
	
  @GetMapping("/v1")
  public String test() {
	  return "Welcome to Spring Boot Openshift app from Version 1";
  }
	
  @GetMapping("/v1/{input}")
  public String test(@PathVariable String input) {
	  return "Welcome " + input + " to Spring Boot Openshift app from Version 1";
  }
}
