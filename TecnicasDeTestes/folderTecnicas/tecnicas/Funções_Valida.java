package tecnicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import testes.ValidateDate;

public class Funções_Valida {
	
	ValidateDate validate = new ValidateDate();
	
	@Test
	@DisplayName("Dia inválido")
	void DataInvalidaPorDia() {
		assertFalse(validate.validaData(31, 11, 2020));
	}
	
	@Test
	@DisplayName("Mês inválido")
	void DataInvalidaPorMes() {
		assertFalse(validate.validaData(01, 00, 2010));
	}
	
	
	@Test
	@DisplayName("Ano inválido")
	void DataInvalidaPorAno() {
		assertFalse(validate.validaData(31, 11, 1000));
	}
	
	@Test
	@DisplayName("Último dia de Fevereiro em um ano não bissexto")
	void FevereiroAnoNaoBissexto() {
		assertFalse(validate.validaData(29, 02, 2015));
	}

}