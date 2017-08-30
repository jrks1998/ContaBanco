package br.com.institutoivoti.lib;

public class Conta {
	private String nome;
	private String agencia;
	private String numero;
	private int saldo;
	private double limite;
	private String cpf;
	
	public Conta() {
	
	}

	public String getTitular() {
		return this.nome;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public String getNumero() {
		return this.numero;
	}

	public int getSaldo() {
		return this.saldo;
	}
	
	public double incrementaSaldo() {
		return this.saldo;
	}
	
	public double getDebitoConta() {
		return this.saldo;
	}
	
	public boolean getLimite() {
		return this.saldo <= this.limite;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public double getCredito() {
		return this.saldo;
	}

	public String Titular(String nomeCidadao) {
		return this.nome = nomeCidadao;
	}

	public String Agencia(String nomeAgencia) {
		return this.agencia = nomeAgencia;
	}

	public String NumeroConta(String numeroDaConta) {
		return this.numero = numeroDaConta;
	}

	public int Saldo() {
		return this.saldo;
	}
	
	public double Credito(double creditoConta) {
		return this.saldo += creditoConta;
	}

	public double DebitaDaConta(double debito) {
		return this.saldo -= debito;
	}
	
	public double limiteConta(double limiteDaConta) {
		return this.limite = limiteDaConta;
	}
	
	public String cpfDoCidadao(String cpfConta) {
		return this.cpf = cpfConta;
	}
		
}

	

