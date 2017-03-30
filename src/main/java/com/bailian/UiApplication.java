package com.bailian;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
/*@ComponentScan(basePackages= "com.bailian.demo.init")*/
public class UiApplication {

	@RequestMapping("/resource")
	public Map<String,Object> home() {
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World");
		return model;
	}
	
//	@RequestMapping("/login")
//	public Map<String,Object> login() {
//		Map<String,Object> model = new HashMap<String,Object>();
//		model.put("user", "tony");
//		return model;
//	}

	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(UiApplication.class, args);
	}

}
