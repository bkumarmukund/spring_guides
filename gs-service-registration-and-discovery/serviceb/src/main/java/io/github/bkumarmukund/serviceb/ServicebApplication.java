package io.github.bkumarmukund.serviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServicebApplication {

	@GetMapping("helloB")
	public String sayHelloB() {
		return "hello from service B";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServicebApplication.class, args);
	}

}
