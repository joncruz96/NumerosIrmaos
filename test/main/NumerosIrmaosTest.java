package main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class NumerosIrmaosTest {
	
	@Test
	@DisplayName("Deve retornar o maior número numero dos números irmãos.")
	void deveRetornarMaiorNumeroVálido() {

		int numero = new NumerosIrmaos().descobrirNumIrmaos("4569823");
		
		assertEquals(numero, 9865432);
	}
	
	@Test
	@DisplayName("Não deve retornar o maior número informando caracteres inválidos.")
	void naoDeveRetornarMaiorNumeroComCaracteresInválidos() {

		Executable action = () ->  new NumerosIrmaos().descobrirNumIrmaos("638+2*463");
		
		assertThrows(IllegalArgumentException.class, action);
	}

	@Test
	@DisplayName("Deve executar método main corretamente.")
	public void testMain() {
	    String[] args = null;
	    MainApplication.main(args);
	}
	
}
