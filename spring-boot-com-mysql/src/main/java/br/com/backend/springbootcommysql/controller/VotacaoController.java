package br.com.backend.springbootcommysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.springbootcommysql.models.Votacao;
import br.com.backend.springbootcommysql.repository.VotacaoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Pautas")
public class VotacaoController {
	
	@Autowired
	VotacaoRepository votacaoRepository;
	
	@PostMapping("/votacao")
	@ApiOperation(value="Adicona os votos")
	public Votacao saveVotacao(@RequestBody Votacao votacao) {
		return votacaoRepository.save(votacao);
	}
	
	@GetMapping("/votacao")
	@ApiOperation(value="Busca os votos")
	public List<Votacao> listaVotacao(){
		return votacaoRepository.findAll();
	}

}
