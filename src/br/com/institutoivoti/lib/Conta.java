package br.com.institutoivoti.lib;

public class Conta {
	private String nome;
	private String agencia;
	private int numero;
	private double saldo;
	
	public Conta() {
	
	}

	public Conta(String nomeCidadao, String nomeAgencia, int numeroDaConta, double saldoConta) {
		this.nome = nomeCidadao;
		this.agencia = nomeAgencia;
		this.numero = numeroDaConta;
		this.saldo = saldoConta;
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

	public double getSaldo() {
		return this.saldo;
	}
	
	public double incrementaSaldo() {
		return this.saldo;
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

	public double Saldo(double saldoConta) {
		return this.saldo = saldoConta;
	}
	
	public double IncrementaSaldo(double saldoConta) {
		return this.saldo += saldoConta;
	}

}
