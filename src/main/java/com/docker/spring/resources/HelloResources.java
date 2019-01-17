package com.docker.spring.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResources {

	@GetMapping
	public String hello() {
		return "Hello Sinan";
	}
}
