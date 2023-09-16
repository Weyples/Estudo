package com.portal.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
//Com a anotação Data não precisa criar get e set para cada um dos atributos.(é como se ele criasse automaticamente por baixo dos panos)

@Builder
//Permite que crie o um designerPattern (designer de construção) -- permite criação de objetos com todos os atributos ou somente com alguns especificos

@NoArgsConstructor
//NoArgsConstructor é como se tivesse criando um construtor sem nenhum argumento


@AllArgsConstructor
//AllArgsConstructor é como se tivesse criando um construtor com todos os argumentos

@JsonInclude
public class OwnerPostDTO {
	
	private String name;
	private String type;
	private String contactNumber;

}
