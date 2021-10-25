package br.com.backend.springbootcommysql.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Votacao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_votos;
	@Column
	private String voto;
	@Column
	private String nomePauta;
	@Column
	private String cpfColaborador;
	@ManyToOne
	@JoinColumn(name="Id_ssociados")
	private Associados associados;
	@ManyToOne
	@JoinColumn(name="Id_pautas")
	private Pautas pautas;
	
}
