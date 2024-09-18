package io.github.bkumarmukund.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceaApplication {

	@GetMapping("helloA")
	public String sayHelloA() {
		return "hello from service A";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceaApplication.class, args);
	}

}
