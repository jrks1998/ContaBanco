package br.com.institutoivoti;

import br.com.institutoivoti.lib.Banco;
import br.com.institutoivoti.lib.Conta;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Banco banco = new Banco("banco");
		banco.AbreConta();
		banco.ImprimeContas();
		Conta ultimaConta = banco.GetUltimaContaAberta();
		ultimaConta.Credito(1000);
		
		banco.AbreConta();
		banco.ImprimeContas();
		ultimaConta = banco.GetUltimaContaAberta();
		
		banco.ImprimeContas();
		
		}

}
