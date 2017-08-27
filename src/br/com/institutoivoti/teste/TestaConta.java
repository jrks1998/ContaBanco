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
		conta.Titular("Grovy");
		assertEquals(conta.getTitular(), "Grovy");
	}
	
	@Test
	public void testaAgencia() {
		conta.Agencia("Grovy Bank");
		assertEquals(conta.getAgencia(), "Grovy Bank");
	}
	
	@Test
	public void testaNumeroConta() {
		conta.NumeroConta(8000);
		assertEquals(conta.getNumero(), 8000);
	}
	
	@Test
	public void testaSaldo() {
		conta.Saldo(23135.30);
		assertEquals(conta.getSaldo(), 23135.30, 0);
	}
	
	@Test
	public void testaSaldoZerado() {
		conta.Saldo(0);
		assertEquals(conta.getSaldo(), 0, 0);
	}
	
	@Test
	public void incrementaSaldo() {
		conta.Saldo(0);
		conta.IncrementaSaldo(20);
		assertEquals(conta.incrementaSaldo(), 20, 0);
	}

}