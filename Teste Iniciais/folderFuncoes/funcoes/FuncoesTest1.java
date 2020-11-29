package funcoes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncoesTest1 {

	@Test
	public void testAdiciona() {
		funcoesMatematicas c1 = new funcoesMatematicas();
		long resultado = c1.calcularFatorial(4);
		assertEquals(24, resultado);
	}

}
