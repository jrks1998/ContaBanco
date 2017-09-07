package br.com.institutoivoti.lib;

public class Conta {
	private String titular;
	private String agencia;
	private String numero;
	private int saldo;
	
	public Conta(String nome, String agenciaConta, String numeroConta) {
		this.titular = nome;
		this.agencia = agenciaConta;
		this.numero = numeroConta;
		this.saldo = 0;
	}

	public String getTitular() {
		return this.titular;
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
	
	public double getDebito() {
		return this.saldo;
	}
	
	public double getCredito() {
		return this.saldo;
	}

	public String Titular() {
		return this.titular;
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

	public double Debito(double debitoConta) {
		return this.saldo -= debitoConta;
	}
	
	public void ImprimeDados() {
		System.out.println("Informações da conta");		
		System.out.println("nome: " + this.titular);
		System.out.println("numero da conta: " + this.numero);
		System.out.println("agencia: " + this.agencia);
		System.out.println("saldo: " +this.saldo);
	}
	
}