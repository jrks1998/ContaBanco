package br.com.institutoivoti.lib;

public class Conta {
	private String nome;
	private String agencia;

public Conta() {
	this.nome = "Grovy";
	this.agencia = "Grovy Bank";
}

public String getTitular() {
	return this.nome;
}

public String getAgencia() {
	return this.agencia;
}

public String Titular(String nome) {
	return this.nome = "Grovy";
}

public String Agencia(String agencia) {
	return this.agencia;
}

}
