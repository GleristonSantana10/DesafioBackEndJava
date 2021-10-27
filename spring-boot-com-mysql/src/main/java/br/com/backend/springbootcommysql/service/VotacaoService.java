package br.com.backend.springbootcommysql.service;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import br.com.backend.springbootcommysql.models.Associados;
import br.com.backend.springbootcommysql.models.Pautas;
import br.com.backend.springbootcommysql.models.Votacao;
import br.com.backend.springbootcommysql.models.dto.VotoDTO;
import br.com.backend.springbootcommysql.repository.VotacaoRepository;


@Service
public class VotacaoService  extends AbstractServices<Votacao, Long>  {

    private static final Logger logger = LoggerFactory.getLogger(VotacaoService.class);
    
    @Autowired
    VotacaoRepository dao;
    
    @Autowired
    PautasService pautaService;
    
    @Autowired
    AssociadoService associadoService;

	
	public List<Votacao> findByPauta(Pautas pauta) {
		return dao.findByPautas(pauta);
	}


	@Override
	public PagingAndSortingRepository<Votacao, Long> getRepository() {
		// TODO Auto-generated method stub
		return null;
	}
}