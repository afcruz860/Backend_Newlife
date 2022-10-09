package com.newlife.apinewlife;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApinewlifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApinewlifeApplication.class, args);
		System.out.print("Api corriendo...");
		
	}

	@Bean
	public ModelMapper modelMapper(){

		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}

	
}
