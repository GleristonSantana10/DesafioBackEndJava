package br.com.backend.springbootcommysql.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.backend.springbootcommysql.models.Associados;
import br.com.backend.springbootcommysql.models.Pautas;
import br.com.backend.springbootcommysql.models.Votacao;

@Repository
public interface VotacaoRepository extends JpaRepository<Votacao, Long>{
	
	Optional<Votacao> findByPautasAssociados(Pautas pautas, Associados associados);
	
	List<Votacao> findByPautas(Pautas pautas);

}
