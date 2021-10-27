package br.com.backend.springbootcommysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.springbootcommysql.models.dto.VotoDTO;
import br.com.backend.springbootcommysql.service.VotacaoService;
import io.swagger.annotations.Api;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Pautas")
public class VotacaoController {
	
	@Autowired
    VotacaoService votoService;

    @PostMapping({"/v1.0"})
    public ResponseEntity<String> enviarMensagem(@RequestBody VotoDTO voto){
    	
    	//votoService.validaVoto(voto);
    	//votoService.sendMessage(voto.toJson());
        return ResponseEntity.ok().body("Voto Computado: ");
    }
	
}
