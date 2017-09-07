package br.com.institutoivoti.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.institutoivoti.lib.Conta;

public class TestaConta {
	private Conta conta;
	
	@Before
	public void before() {
		conta = new Conta("Jonas", "22-55", "6565-8");
	}
	

	@Test
	public void testaDadosDaConta() {
		assertEquals(conta.getTitular(), "Jonas");
		assertEquals(conta.getAgencia(), "22-55");
		assertEquals(conta.getNumero(), "6565-8");
	}
	
	@Test
	public void testaSaldo() {
		conta.Saldo();
		assertEquals(conta.getSaldo(), 0, 0);
	}
	
	@Test
	public void testaDebito() {
		conta.Credito(100);
		conta.Debito(20);
		assertEquals(conta.getDebito(), 80, 0);
	}
	
	@Test
	public void testaCredito() {
		conta.Credito(100);
		assertEquals(conta.getCredito(), 100, 0);
	}
	
}