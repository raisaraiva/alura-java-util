package test;

import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.Arrays;

public class Array {

	public static void test() {

		System.out.println("Array -> String[]");

		String[] args = new String[2];

		args[0] = "zero";
		args[1] = "one";

		System.out.println(Arrays.toString(args));

		for (String arg : args) {
			System.out.println(arg);
		}

		System.out.println("Array -> int[]");

		int[] idades = new int[5];

		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}

		for(int i = 0; i < idades.length; i++) {
			System.out.println(i + " - " + idades[i]);
		}

		System.out.println("Array -> Object[]");

		Object[] referencias = new Object[5];

		System.out.println(referencias.length);

		ContaCorrente contaCorrente = new ContaCorrente(1, 1);
		ContaPoupanca contaPoupanca = new ContaPoupanca(1, 2);

		referencias[0] = contaCorrente;
		referencias[1] = contaPoupanca;

		Cliente cliente = new Cliente();

		referencias[2] = cliente;

		ContaPoupanca referencia = (ContaPoupanca) referencias[1];

		System.out.println(contaPoupanca.getNumero());
		System.out.println(referencia.getNumero());
	}
}
