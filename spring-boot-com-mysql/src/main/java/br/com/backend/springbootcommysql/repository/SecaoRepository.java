package br.com.backend.springbootcommysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.springbootcommysql.models.Secao;

public interface SecaoRepository extends JpaRepository<Secao, Long>{

}
