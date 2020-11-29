package funcoes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncoesTest {

	@Test
	public void testAdiciona() {
		funcoesMatematicas c1 = new funcoesMatematicas();
		Integer resultado = (int) c1.calcularPotencia(2, 4);
		assertEquals(16, resultado);
	}

}
