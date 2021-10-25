package br.com.backend.springbootcommysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.springbootcommysql.models.Pautas;

public interface PautasRepository extends JpaRepository<Pautas, Long>{

}
