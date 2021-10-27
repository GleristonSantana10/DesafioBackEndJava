package br.com.backend.springbootcommysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.backend.springbootcommysql.models.Associados;

@Repository
public interface AssociadosRepository extends JpaRepository<Associados, Long>{

}
