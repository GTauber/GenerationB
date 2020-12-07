package com.softskills.Skills.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ment")
public class mentalitiesController {
	
	@GetMapping
	public String Ment1() {
		String m1="Minha primeira mentalidade que eu gostaria de citar agora é persistencia, sou uma pessoa muito persistente.";
		return m1;
	}
	
	@GetMapping("/ment2")
	public String Ment2() {
		String m2="Minha segunda mentalidade que eu gostaria de citar também é mentalidade do crescimento onde procuro lembrar que cada um tem"
				+ "sua curva de aprendizagem, entre tanto devo me esforçar ao maximo para que a minha seja a mais rapida"
				+ "possivel.";
		return m2;
	}

}
