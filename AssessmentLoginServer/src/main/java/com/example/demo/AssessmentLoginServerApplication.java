package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableDiscoveryClient
@EnableHystrix
@SpringBootApplication
public class AssessmentLoginServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentLoginServerApplication.class, args);
	}
	


}
