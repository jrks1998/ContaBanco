package br.com.institutoivoti.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
	private String nome;
	public List<Conta> contas = new ArrayList<Conta>();
	
	public Banco(String nome) {
		this.nome = nome;
	}
	
	public void AbreConta() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Abertura de conta");						
		
		System.out.print("Digite o nome: ");
		String nome = s.next();
		
		System.out.print("Digite a agência: ");
		String numero = s.next();
		
		System.out.print("Digite o número da conta: ");
		String agencia = s.next();
		
		this.contas.add(new Conta(nome, numero, agencia));		
	}
	
	public void ImprimeContas() {
		for(int i = 0; i < this.contas.size(); i++) {
			this.contas.get(i).ImprimeDados();
		}
	}
	
	public Conta GetUltimaContaAberta() {
		return this.contas.get(this.contas.size()-1);
	}

}