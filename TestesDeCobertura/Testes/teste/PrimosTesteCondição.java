package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import geradordeprimos.GeradorPrimos;

public class PrimosTesteCondição {

	GeradorPrimos primos = new GeradorPrimos();

	@Test
	void NumeroIgualZero() throws Exception {
		assertEquals(null, primos.gerarPrimosAte(0));
	}

	@Test
	void NumeroIgualUm() throws Exception {
		assertNull(primos.gerarPrimosAte(1));
	}

	@Test
	void NumeroNegativo() throws Exception {
		assertEquals(null, primos.gerarPrimosAte(-10));
	}

}
