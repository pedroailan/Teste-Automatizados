package tecnicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import testes.ValidateDate;

public class Fun��es_Valida {
	
	ValidateDate validate = new ValidateDate();
	
	@Test
	@DisplayName("Dia inv�lido")
	void DataInvalidaPorDia() {
		assertFalse(validate.validaData(31, 11, 2020));
	}
	
	@Test
	@DisplayName("M�s inv�lido")
	void DataInvalidaPorMes() {
		assertFalse(validate.validaData(01, 00, 2010));
	}
	
	
	@Test
	@DisplayName("Ano inv�lido")
	void DataInvalidaPorAno() {
		assertFalse(validate.validaData(31, 11, 1000));
	}
	
	@Test
	@DisplayName("�ltimo dia de Fevereiro em um ano n�o bissexto")
	void FevereiroAnoNaoBissexto() {
		assertFalse(validate.validaData(29, 02, 2015));
	}

}