package br.com.backend.springbootcommysql.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Votacao {
	
	@GeneratedValue
	@Id
	private Long id;
	
	private boolean voto;

	@NotNull(message="Associado não informado.")
	@ManyToOne
	private Associados associados;
	
	@NotNull(message="Pauta não informada.")
	@ManyToOne
	private Pautas pautas;
	
}
