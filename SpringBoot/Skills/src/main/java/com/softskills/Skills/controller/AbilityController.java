package com.softskills.Skills.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ability")
public class AbilityController {
	
	@GetMapping
	public String Ability1() {
		return "Primeira SoftSkill: Eu creio que uma de minhas habilidades seja orientação aos detalhes, eu costumo prestar bastante atenção "
				+ "aos detalhes";
	}
	
	@GetMapping("/ability2")
	public String Ability2() {
		String Ab2="Já minha segunda habilidade é proatividade, sou bastante proativo e sempre que me empenho em um projeto gosto de refina-lo"
			+ " sempre fazendo mais e mais.";
		return Ab2;
	}

}
