package com.bext.springbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaController {
	
    @RequestMapping("/hola")
	public String SaludaPerrito() {
		return "Hola Perrito!";
	}
}
