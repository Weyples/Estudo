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

public class CarPostDTO { //DTO = DATA TRANSFER OBJECT = OBJETO DE TRANSFERENCIA DE DADOS

	
	private String model;
	
	
	private String brand;
	
	
	private String price;
	
	
	private String description;
	
	
	private String engineVersion;
	
	
	private String city;
	
	
	private String CreatedDate;
	
	
	private Long ownerID;
	
	
	private String ownerName;
	
	
	private String ownerType;
	
	
	private String contact;
}
