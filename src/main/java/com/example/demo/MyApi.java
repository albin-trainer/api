package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {
public String hello() {
	return "<h1> Hello i m coming from REST API</h1>";
}
}

