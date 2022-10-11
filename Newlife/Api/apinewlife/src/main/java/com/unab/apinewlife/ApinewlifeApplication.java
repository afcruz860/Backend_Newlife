package com.unab.apinewlife;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ApinewlifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApinewlifeApplication.class, args);
		System.out.println("api corriendo...");
	}

	@Bean
	public ModelMapper modelMapper(){
		
		ModelMapper modelMapper=new ModelMapper();
		return modelMapper;
	}

}

