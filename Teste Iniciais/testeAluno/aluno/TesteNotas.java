package aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteNotas {

	@Test
	public void notas() {
		Aluno c1 = new Aluno();
		c1.adicionaNota(10);
		c1.adicionaNota(10);
		c1.adicionaNota(4);
		
		c1.setFrequencia(80);
		c1.setNome("Pedro");
		
		assertTrue(c1.aprovado());
		
	}
	
}
