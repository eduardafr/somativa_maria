package com.exemplo.biblioteca.model.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.biblioteca.model.entities.Autor;
import com.exemplo.biblioteca.model.repository.AutorRepository;

@RestController
@RequestMapping("/autores")
public class AutorController {
	@Autowired
	private AutorRepository autorRepository;

	@GetMapping
	public List<Autor> listar() {
		return autorRepository.findAll();
	}

	@PostMapping
	public Autor criar(@RequestBody Autor autor) {
		return autorRepository.save(autor);
	}
}
