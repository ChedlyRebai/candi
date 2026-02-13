package com.candidate.chedly;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChedlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChedlyApplication.class, args);
	}

	@Autowired
	private CandidatRepository candidatRepository;

	@Bean
	ApplicationRunner init(){
		return args -> {
			List<Candidat> candidates = List.of(
				new Candidat("chedly1", "chedly.rebai123@gmail.com", "Rebai"),
				new Candidat("chedly2", "chedly.rebai123@gmail.com", "Rebai"),
				new Candidat("chedly3", "chedly.rebai123@gmail.com", "Rebai")
			);
				
			if(candidatRepository.count() == 0){
				candidatRepository.saveAll(candidates);
			}
		};
	}

}
