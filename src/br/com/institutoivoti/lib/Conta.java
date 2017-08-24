package br.com.institutoivoti.lib;

public class Conta {
	private String nome;
	private String agencia;
	private int numero;
	
public Conta() {
	
}

public Conta(String nomeCidadao, String nomeAgencia, int numeroDaConta) {
	this.nome = nomeCidadao;
	this.agencia = nomeAgencia;
	this.numero = numeroDaConta;
}

public String getTitular() {
	return this.nome;
}

public String getAgencia() {
	return this.agencia;
}

public int getNumero() {
	return this.numero;
}

public String Titular(String nomeCidadao) {
	return this.nome = nomeCidadao;
}

public String Agencia(String nomeAgencia) {
	return this.agencia = nomeAgencia;
}

public int NumeroConta(int numeroDaConta) {
	return this.numero = numeroDaConta;
}

}
