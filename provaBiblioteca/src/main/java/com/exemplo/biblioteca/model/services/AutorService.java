package com.exemplo.biblioteca.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemplo.biblioteca.model.entities.Autor;
import com.exemplo.biblioteca.model.repository.AutorRepository;
import com.exemplo.biblioteca.model.repository.LivroRepository;

@Service
public class AutorService {
	private final AutorRepository autorRepository;

	@Autowired
	public AutorService(AutorRepository autorRepository) {
		this.autorRepository = autorRepository;
	}

	public Autor saveAutor(Autor autor) {
		return autorRepository.save(autor);
	}

	public Autor getAutorById(Long id) {
		return autorRepository.findById(id).orElse(null);
	}

	public List<Autor> getAllAutor() {
		return autorRepository.findAll();
	}

	public void deleteAutor(Long id) {
		autorRepository.deleteById(id);
	}
}
