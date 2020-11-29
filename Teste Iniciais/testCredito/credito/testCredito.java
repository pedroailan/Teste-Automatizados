package credito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCredito {

	@Test
	public void test() {
		Credito c1 = new Credito();
		
		double resultado = c1.definirCredito(12, true, 6000);
		assertEquals(20000, resultado);
	} 

}
