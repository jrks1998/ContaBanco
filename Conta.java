package br.com.institutoivoti.lib;

import java.util.Scanner;

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
	
	public double getDebito() {
		return this.saldo;
	}
	
	public boolean getLimite() {
		return this.saldo <= this.limite;
	}
	
<<<<<<< HEAD
=======
	public boolean getLimite() {
		return this.saldo <= this.limite;
	}
	
>>>>>>> 64c3214885db599783638c21253e1a10f0e2aee0
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

<<<<<<< HEAD
	public double Saldo() {
=======
	public int Saldo() {
>>>>>>> 64c3214885db599783638c21253e1a10f0e2aee0
		return this.saldo;
	}
	
	public double Credito(double creditoConta) {
		return this.saldo += creditoConta;
	}

	public double Debito(double debitoConta) {
		return this.saldo -= debitoConta;
	}
	
	public double limiteConta(double limiteDaConta) {
		return this.limite = limiteDaConta;
	}
<<<<<<< HEAD
=======
	
	public String cpfDoCidadao(String cpfConta) {
		return this.cpf = cpfConta;
	}
		
}

>>>>>>> 64c3214885db599783638c21253e1a10f0e2aee0
	
	public String cpfDoCidadao(String cpfConta) {
		return this.cpf = cpfConta;
	}
	
	public void ImprimeDados() {
		Scanner scan = new Scanner(System.in);
		System.out.println("nome do titular da conta: ");
		nome = scan.next();
		System.out.println("numero da conta: ");
		numero = scan.next();
		System.out.println("cpf do titular: ");
		cpf = scan.next();
		System.out.println("agencia: ");
		agencia = scan.next();
		System.out.println("nome: " +nome);
		System.out.println("numero da conta: " +numero);
		System.out.println("cpf: " +cpf);
		System.out.println("agencia: " +agencia);
	}
	
}