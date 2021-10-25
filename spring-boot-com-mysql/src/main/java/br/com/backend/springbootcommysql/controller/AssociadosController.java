package br.com.backend.springbootcommysql.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.springbootcommysql.models.Associados;
import br.com.backend.springbootcommysql.repository.AssociadosRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Pautas")
public class AssociadosController {
	
	@Autowired
	AssociadosRepository associadosRepository;
	
	@PostMapping("/associados")
	@ApiOperation(value="Adicionar cooperados")
	public Associados saveAssociados(@RequestBody Associados associados) {
		return associadosRepository.save(associados);
	}

}
