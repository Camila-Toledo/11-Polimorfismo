package br.com.glandata.polimorfismo.service;

import br.com.glantada.polimorfismo.model.Funcionario;
import lombok.Getter;

public class ControleBonificacao {

	@Getter
	private double soma;

	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}

	// Métodos não mais necessários por conta do polimorfismo da classe Funcionario
	/*
	public void registra(Gerente g) {
		double boni = g.getBonificacao();
		this.soma += boni;
	}

	public void registra(EditorVideo e) {
		double boni = e.getBonificacao();
		this.soma += boni;
	}

	public void registra(Designer d) {
		double boni = d.getBonificacao();
		this.soma += boni;
	}
	*/

}
