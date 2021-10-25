package br.com.backend.springbootcommysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.springbootcommysql.models.Pautas;
import br.com.backend.springbootcommysql.repository.PautasRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Pautas")
public class PautasControlles {

	@Autowired
	PautasRepository pautaRepository;
	  
	@GetMapping("/pautas")
	@ApiOperation(value="Retorna uma lista de pautas")
	public List<Pautas> listaPautas(){
		return pautaRepository.findAll();
	}
	
	@PostMapping("/pautas")
	@ApiOperation(value="Cria as pautas")
	public Pautas savePautas(@RequestBody Pautas pautas) {
		return pautaRepository.save(pautas);
	}
	
	
}
