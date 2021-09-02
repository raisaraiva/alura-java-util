package test;

import model.Conta;
import model.ContaCorrente;
import model.GuardadorDeReferencias;

public class ValidaGuardadorDeReferencias {

	public static void test() {
		
		GuardadorDeReferencias guardadorDeReferencias = new GuardadorDeReferencias();

		Conta contaCorrenteA = new ContaCorrente(1, 1);

		guardadorDeReferencias.adiciona(contaCorrenteA);

		Conta contaCorrenteB = new ContaCorrente(1, 2);

		guardadorDeReferencias.adiciona(contaCorrenteB);
		
		int tamanho = guardadorDeReferencias.getQuantidadeDeElementos();

		System.out.println(tamanho);
		
		Conta referencia = (Conta) guardadorDeReferencias.getReferencia(0);

		System.out.println(referencia.getNumero());
		
	}
}
