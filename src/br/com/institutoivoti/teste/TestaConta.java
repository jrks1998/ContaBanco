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
		conta.cpfDoCidadao("038.828.850-76");
		assertEquals(conta.getTitular(), "Grovy");
		assertEquals(conta.getCPF(), "038.828.850-76");
	}
	
	@Test
	public void testaAgencia() {
		conta.Agencia("21-89");
		assertEquals(conta.getAgencia(), "21-89");
	}
	
	@Test
	public void testaNumeroConta() {
		conta.NumeroConta("1234-5");
		assertEquals(conta.getNumero(), "1234-5");
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
	
	@Test
	public void debito() {
		conta.Saldo(50);
		conta.DebitaDaConta(20);
		assertEquals(conta.getDebitoConta(), 30, 0);
	}
	
	@Test
	public void saldoNegativo() {
		conta.Saldo(0);
		conta.DebitaDaConta(10);
		assertEquals(conta.getDebitoConta(), -10, 0);
	}
	
	@Test
	public void incrementaSaldoNegativo() {
		conta.Saldo(-10);
		conta.IncrementaSaldo(20);
		assertEquals(conta.incrementaSaldo(), 10, 0);
	}
	
	@Test
	public void testaLimiteSaldo() {
		conta.Saldo(100);
		conta.DebitaDaConta(120);
		conta.limiteConta(-30);
		assertEquals(conta.getLimite(), false);
	}
	
	@Test
	public void excedendoLimiteConta() {
		conta.Saldo(100);
		conta.DebitaDaConta(110);
		conta.limiteConta(-10);
		
		assertEquals(conta.getLimite(), true);
	}
	
	@Test
	public void testaCredito() {
		conta.Saldo(789);
		conta.Credito(100);
		assertEquals(conta.getCredito(), 889, 0);
	}
	
}