package snmaddula.pochub.simplemsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello from Simple MS App!";
	}
	
	@GetMapping("/hello2")
	public String helloWithHeader(@RequestHeader("x-msg") String msg) {
		return "Hello from Simple MS App! [X-MSG=" + msg + "]";
	}
}
