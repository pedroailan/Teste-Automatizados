package tecnicas;

import static  org.junit.jupiter.api.Assertions. * ;

import  org.junit.jupiter.api.Test ;

import testes.Largest;


public class Funções_Largest {
	
	@Test
	void nula() {
		assertThrows(Exception.class, () -> {
			Largest.largest(null);
		});
	}
	
	@Test
	void listaComNElmentosInteiros() {
		int[] list = {-1,0,2,1};
		assertEquals(2, Largest.largest(list));
	}
	
	@Test
	void listaComDuplicidadeDeElementos() {
		int[] list = {-1,2,1,1,2};
		assertEquals(2, Largest.largest(list));
	}


}
