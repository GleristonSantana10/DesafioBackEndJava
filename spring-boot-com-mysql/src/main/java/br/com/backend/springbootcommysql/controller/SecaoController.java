package br.com.backend.springbootcommysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.springbootcommysql.models.Secao;
import br.com.backend.springbootcommysql.repository.SecaoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Pautas")
public class SecaoController {
	

	@Autowired
	SecaoRepository secaoRepository;
	
	@PostMapping("/secao")
	@ApiOperation(value="Adicionar secao de votacao")
	public Secao saveSecao(@RequestBody Secao secao) {
		return secaoRepository.save(secao);
	}

}
