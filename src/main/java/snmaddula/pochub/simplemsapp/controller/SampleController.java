package snmaddula.pochub.simplemsapp.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import snmaddula.pochub.simplemsapp.model.Alpha;

@RestController
@RequestMapping("/sample")
public class SampleController {

	@GetMapping
	public String plainGet() {
		return "--- [GET] --- Hello from Simple MS App!";
	}

	@GetMapping("/with-headers")
	public String withHeaders(@RequestHeader("x-msg") String msg) {
		return "--- [GET] --- headers --- [X-MSG=" + msg + "]";
	}

	@GetMapping("/with-param")
	public String withRequestParam(@RequestParam String msg) {
		return "--- [GET] --- params --- [msg=" + msg + "]";
	}

	@GetMapping("/with-path/{id}")
	public String getWithPathVariable(@PathVariable String id) {
		return "--- [GET] --- pathvariable --- [id=" + id + "]";
	}

	@DeleteMapping("/with-path/{id}")
	public String deleteWithPathVariable(@PathVariable String id) {
		return "--- [DELETE] --- pathvariable --- [id=" + id + "]";
	}

	@PostMapping("/with-body")
	public Alpha post(@RequestBody Alpha alpha) {
		System.out.println("--- [POST] --- Alpha received " + alpha + " ---");
		alpha.setDate(new Date());
		return alpha;
	}

	@PutMapping("/with-body")
	public Alpha put(@RequestBody Alpha alpha) {
		System.out.println("--- [PUT] --- Alpha received " + alpha + " ---");
		alpha.setDate(new Date());
		return alpha;
	}

}
