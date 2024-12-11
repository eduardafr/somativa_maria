
package com.exemplo.biblioteca.model.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.biblioteca.model.entities.Livro;
import com.exemplo.biblioteca.model.repository.LivroRepository;

@RestController
@RequestMapping("/livros")
public class LivroController {
	@Autowired
	private LivroRepository livroRepository;

	@GetMapping
	public List<Livro> listar() {
		return livroRepository.findAll();
	}

	@PostMapping
	public Livro criar(@RequestBody Livro livro) {
		return livroRepository.save(livro);
	}
}
