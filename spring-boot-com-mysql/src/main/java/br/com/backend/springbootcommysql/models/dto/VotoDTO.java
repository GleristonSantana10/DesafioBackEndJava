package br.com.backend.springbootcommysql.models.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties
public class VotoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	Long cpf;
	Long idPauta;
	boolean voto;
 
    
}
