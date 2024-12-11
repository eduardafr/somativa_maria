package com.exemplo.biblioteca.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.biblioteca.model.entities.Autor;

public interface  AutorRepository extends JpaRepository<Autor, Long> {

}
