package br.com.institutoivoti.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.institutoivoti.lib.Conta;

public class TestaConta {
	private Conta conta;
	
	@Before
	public void before() {
		conta = new Conta();
	}
	

	@Test
	public void testaNome() {
		conta.Titular("Andre");
		assertEquals(conta.getTitular(), "Andre");
	}
	
	@Test
	public void testaAgencia() {
		conta.Agencia("abestado");
		assertEquals(conta.getAgencia(), "abestado");
	}
	
	@Test
	public void testaNumeroConta() {
		conta.NumeroConta(4651);
		assertEquals(conta.getNumero(), 4651);
	}

}