package dockerProj1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import dockerProj1.model.UserData;



@RestController
public class DockerProj1Controller {
	@GetMapping("/test")
	public String method1() {
		// final String uri = "http://localhost:8080/springrestexample/employees.xml";
		final String uri = "http://localhost:8079/hello";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return result;
	}

	@PostMapping("/addUser")
	public UserData method2(@RequestBody UserData userData) {
		return userData;

	}

}
