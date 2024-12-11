package com.exemplo.biblioteca.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.biblioteca.model.entities.Livro;

public interface  LivroRepository extends JpaRepository<Livro, Long> {

}
