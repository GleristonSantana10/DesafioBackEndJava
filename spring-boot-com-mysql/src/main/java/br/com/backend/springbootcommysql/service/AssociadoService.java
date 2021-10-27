package br.com.backend.springbootcommysql.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import br.com.backend.springbootcommysql.models.Associados;
import br.com.backend.springbootcommysql.repository.AssociadosRepository;



@Service
public class AssociadoService  extends AbstractServices<Associados, Long>{
	
	@Autowired
	AssociadosRepository dao;
	@Override
	public PagingAndSortingRepository<Associados, Long> getRepository() {
		return dao;
	}
	public Optional<Associados> findByCpf(Long cpf) {
		return dao.findById(cpf);
	}
	public void add(Long cpf) {
		Associados associado = new Associados();
		associado.setCpf(cpf);
		save(associado);
	}

}
