package geradordeprimos;

public class GeradorPrimos {
	public String gerarPrimosAte(int valorMaximo) throws Exception {
		if (valorMaximo >= 2) {
			boolean[] candidatos = inicializaListaCandidatos(valorMaximo);
			for (int valor = 2; valor <= valorMaximo; valor++) {
				if (candidatos[valor]) {
					for (int naoPrimos = 2 * valor; naoPrimos <= valorMaximo; naoPrimos += valor) {
						candidatos[naoPrimos] = false;
					}
				}
			}
			String resultado = String.valueOf(2);
			for (int i = 2 + 1; i <= valorMaximo; i++) {
				if (candidatos[i]) {
					resultado += ", " + i;
				}
			}
			return resultado;
		} else {
			return null;
		}
	}

	public boolean[] inicializaListaCandidatos(int valorMaximo) {
		boolean[] resultado = new boolean[valorMaximo + 1];
		resultado[0] = resultado[1] = false;
		for (int i = 2; i < resultado.length; i++) {
			resultado[i] = true;
		}
		return resultado;

	}

}