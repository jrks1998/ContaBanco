package br.com.institutoivoti.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.institutoivoti.lib.Conta;

public class TestaConta {

	@Test
	public void testaNome() {
		Conta conta = new Conta();
		assertEquals(conta.Titular("Grovy"), "Grovy");
	}

}