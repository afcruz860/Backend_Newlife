package com.unab.proyectounab;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.unab.proyectounab.utils.AppContexto;

@SpringBootApplication()
@EnableJpaAuditing
public class ApiProyectoUNAB {

	public static void main(String[] args) {
		SpringApplication.run(ApiProyectoUNAB.class, args);
		System.out.println("Api corriendo...");

		
	}

	@Bean
	public ModelMapper modelMapper(){

		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AppContexto appContexto(){
		return new AppContexto();
	}

}

