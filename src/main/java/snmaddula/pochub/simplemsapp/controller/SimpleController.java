package snmaddula.pochub.simplemsapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@Value("${server.port}")
	private String port;

	@GetMapping("/hello")
	public String hello() {
		return "Hello from Simple MS App running on port : " + port;
	}
	
	@GetMapping("/")
	public String status() {
		return "Up";
	}
}
