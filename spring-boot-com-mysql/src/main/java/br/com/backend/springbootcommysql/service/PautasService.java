package br.com.backend.springbootcommysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.backend.springbootcommysql.models.Pautas;
import br.com.backend.springbootcommysql.repository.PautasRepository;

@Service
public class PautasService {
	
	@Autowired
	PautasRepository pautasRepository;
	
	public void pautaas(Pautas pautas) {
		pautasRepository.saveAndFlush(pautas);
	};
	
	public List<Pautas> buscarPautas(){
		List<Pautas> listaPautas = pautasRepository.findAll();
	    return listaPautas;
	}

}
