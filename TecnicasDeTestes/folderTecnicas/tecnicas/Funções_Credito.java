package tecnicas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import testes.Credito;

public class Funções_Credito {
	
	Credito credito = new Credito();
	
	@Test
	@DisplayName("Parcelas menor que 12, confiável, salário maior que R$ 5.000,00")
	void test1() {
		assertEquals(20000, credito.definirCredito(11, true, 5001));
	}
	
	@Test
	@DisplayName("Parcelas menor que 12, confiável, salário menor ou igual a R$ 5.000,00")
	void test2() {
		assertEquals(0, credito.definirCredito(11, true, 4999));
	}
	
	
	@Test
	@DisplayName("Parcelas maior que 12, confiável, salário maior que R$ 5.000,00")
	void test3() {
		assertEquals(0, credito.definirCredito(13, true, 5001));
	}
	
	
	@Test
	@DisplayName("Parcelas maior que 12, confiável, salário menor ou igual a R$ 5.000,00")
	void test4() {
		assertEquals(0, credito.definirCredito(13, true, 4999));
	}

}
