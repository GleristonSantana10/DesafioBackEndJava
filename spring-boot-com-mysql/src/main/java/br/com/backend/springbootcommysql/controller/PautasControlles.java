package br.com.backend.springbootcommysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.springbootcommysql.models.Pautas;
import br.com.backend.springbootcommysql.service.PautasService;
import io.swagger.annotations.Api;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Pautas")
public class PautasControlles {

	@Autowired
	PautasService pautasServices;
	
	@GetMapping(path = "/pautas")
	public List<Pautas> buscaTdsPautas(){
		return pautasServices.buscarPautas();
	}
	
	
}
