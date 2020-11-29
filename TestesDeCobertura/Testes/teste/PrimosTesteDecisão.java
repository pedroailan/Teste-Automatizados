package teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import geradordeprimos.GeradorPrimos;

public class PrimosTesteDecisão {
	GeradorPrimos primos = new GeradorPrimos();

	@Test
	void NumeroNaturalMaiorQue1() throws Exception {
		assertEquals("2, 3, 5, 7", primos.gerarPrimosAte(10));
	}

}
