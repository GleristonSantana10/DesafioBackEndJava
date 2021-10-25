package br.com.backend.springbootcommysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.springbootcommysql.models.Votacao;

public interface VotacaoRepository extends JpaRepository<Votacao, Long>{

}
