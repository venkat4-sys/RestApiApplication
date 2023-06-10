package com.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/welcome")
	public String welcomeMsg() {

		return "welcome to RestApi...";
	}

	@GetMapping("/greet")
	public String greetMsg() {

		return "GoodMorning...";
	}

}
