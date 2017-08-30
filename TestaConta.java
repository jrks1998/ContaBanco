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
	public void testaNomeECPF() {
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
		conta.Saldo();
<<<<<<< HEAD
		assertEquals(conta.getSaldo(), 0, 0);
	}
	
	@Test
	public void debito() {
		conta.Debito(20);
		assertEquals(conta.getDebito(), -20, 0);
	}
	
	@Test
	public void testaCredito() {
		conta.Credito(100);
		assertEquals(conta.getCredito(), 100, 0);
	}
	
	@Test
	public void excedeLimiteConta() {
		conta.Saldo();
		conta.Credito(100);
		conta.Debito(120);
=======
		assertEquals(conta.getSaldo(), 0);
	}
	
	@Test
	public void incrementaSaldo() {
		conta.Saldo();
		conta.Credito(20);
		assertEquals(conta.getCredito(), 20, 0);
	}
	
	@Test
	public void debito() {
		conta.Saldo();
		conta.DebitaDaConta(20);
		assertEquals(conta.getDebitoConta(), -20, 0);
	}
	
	@Test
	public void saldoNegativo() {
		conta.Saldo();
		conta.DebitaDaConta(10);
		assertEquals(conta.getDebitoConta(), -10, 0);
	}
	
	@Test
	public void testaLimiteSaldo() {
		conta.Saldo();
		conta.DebitaDaConta(120);
		conta.limiteConta(-30);
		assertEquals(conta.getLimite(), false);
	}
	
	@Test
	public void excedendoLimiteConta() {
		conta.Saldo();
		conta.DebitaDaConta(110);
>>>>>>> 64c3214885db599783638c21253e1a10f0e2aee0
		conta.limiteConta(-10);
		assertEquals(conta.getLimite(), true);
	}
	
<<<<<<< HEAD
=======
	@Test
	public void testaCredito() {
		conta.Saldo();
		conta.Credito(100);
		assertEquals(conta.getCredito(), 100, 0);
	}
	
>>>>>>> 64c3214885db599783638c21253e1a10f0e2aee0
}