package com.algaworks.vinhos.model;

public enum TipoVinho {
	
	BRANCO("Branco"),
	TINTO("Tinto"),
	ROSE("Rose");
	
	private String descricao;
	
	TipoVinho(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
// Assim se usa o messages.properties com th:text="#{|tipoVinho.${tipo}|}"
//	BRANCO, TINTO, ROSE

}
