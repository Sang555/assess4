package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/rest/login")
public class LoginController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/callservice")
	public String invokeService()
	{
		String url="http://MY-SERVICE:8091";
		return restTemplate.getForObject(url, String.class);
	}

}
