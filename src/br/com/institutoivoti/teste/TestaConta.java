package br.com.institutoivoti.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.institutoivoti.lib.Conta;

public class TestaConta {

	@Test
	public void testaNome() {
		Conta conta = new Conta();
		conta.Titular("Grovy");
		assertEquals(conta.getTitular(), "Grovy");
	}
	
	@Test
	public void testaAgencia() {
		Conta conta = new Conta();
		conta.Agencia("Grovy Bank");
		assertEquals(conta.getAgencia(), "Grovy Bank");
	}

}