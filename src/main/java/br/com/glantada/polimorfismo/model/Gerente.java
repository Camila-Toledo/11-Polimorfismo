package br.com.glantada.polimorfismo.model;

import lombok.Getter;
import lombok.Setter;

public class Gerente extends Funcionario {

	@Getter
	@Setter
	private Integer senha = 123456;

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do gerente");
		return super.getBonificacao() + super.getSalario();
	}

	public Boolean autentica(Integer senha) {
		return this.senha.equals(senha);
	}

}
