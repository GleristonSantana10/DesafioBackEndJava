package br.com.backend.springbootcommysql.models;

import java.io.Serializable;
import java.util.Date;

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
public class Secao implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int idSecao;
		@Column
		private Date datInicio;
		@Column
		private Date datFim;
		@Column
		private Boolean status_secao;
		@ManyToOne
		@JoinColumn(name="Id_pautas")
		private Pautas pautas;
	
}
