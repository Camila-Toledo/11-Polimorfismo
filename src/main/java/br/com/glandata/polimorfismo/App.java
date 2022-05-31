package br.com.glandata.polimorfismo;

import br.com.glandata.polimorfismo.service.ControleBonificacao;
import br.com.glantada.polimorfismo.model.Designer;
import br.com.glantada.polimorfismo.model.EditorVideo;
import br.com.glantada.polimorfismo.model.Gerente;

public class App {

	public static void main(String[] args) {

		// Objeto Gerente referenciando ao Funcionario
		// Funcionario Objeto Gerente Referencia
		// Funcionario funcionario = new Gerente();

		Gerente gerente = new Gerente();
		gerente.setNome("Douglas");
		gerente.setSalario(5000.0);
		System.out.println("Autenticou? " + gerente.autentica(123456));

		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setNome("Camila");
		editorVideo.setSalario(2500.0);

		Designer designer = new Designer();
		designer.setNome("Sandra");
		designer.setSalario(2000.0);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(editorVideo);
		controle.registra(designer);

		System.out.println(controle.getSoma());
	}
}
