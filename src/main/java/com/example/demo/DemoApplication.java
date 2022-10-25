package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoApplication {
@GetMapping
	public String GetValue() {return "hIEveryone";}
	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		GreetService greetservice = applicationContext.getBean("greetService",GreetService.class);
		String message = greetservice.say();
		System.out.println(message);

	}

}
