package br.com.dhakamada.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class DockerController {
	
	@RequestMapping("/")
	public String docker() {
		return "DOCKER";
	}
}
