package test;

import model.Conta;
import model.ContaCorrente;
import model.GuardadorDeContas;

public class ValidaGuardadorDeContas {

	public static void test() {
		
		GuardadorDeContas guardadorDeContas = new GuardadorDeContas();
		
		Conta contaCorrenteA = new ContaCorrente(1, 1);

		guardadorDeContas.adiciona(contaCorrenteA);

		Conta contaCorrenteB = new ContaCorrente(1, 2);

		guardadorDeContas.adiciona(contaCorrenteB);
		
		int tamanho = guardadorDeContas.getQuantidadeDeElementos();

		System.out.println(tamanho);
		
		Conta referencia = guardadorDeContas.getReferencia(0);

		System.out.println(referencia.getNumero());
	}
}
