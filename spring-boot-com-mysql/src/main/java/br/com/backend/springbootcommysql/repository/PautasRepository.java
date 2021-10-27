package br.com.backend.springbootcommysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.backend.springbootcommysql.models.Pautas;

@Repository
public interface PautasRepository extends JpaRepository<Pautas, Long>{
	

}
