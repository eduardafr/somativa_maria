package com.exemplo.biblioteca.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemplo.biblioteca.model.entities.Livro;
import com.exemplo.biblioteca.model.repository.LivroRepository;

@Service
public class LivroService {
	
	private final LivroRepository livroRepository;

	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}

	public Livro getLivroById(Long id) {
		return livroRepository.findById(id).orElse(null);
	}

	public List<Livro> getAllLivros() {
		return livroRepository.findAll();
	}

	public void deleteLivro(Long id) {
		livroRepository.deleteById(id);
	}
}
