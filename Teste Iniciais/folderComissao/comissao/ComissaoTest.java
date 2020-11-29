package comissao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComissaoTest {
		@Test
		public void testAdiciona() {
		Comissao c1 = new Comissao();
		c1.inicializaTotal();
		c1.adiciona(20);
		c1.adiciona(60);
		assertEquals(80, c1.getTotal());
		}

}