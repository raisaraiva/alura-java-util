package test;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda {

    public static void test() {

        Cliente clienteA = new Cliente();

        clienteA.setNome("A");

        Conta contaCorrenteA = new ContaCorrente(1, 1);

        contaCorrenteA.setTitular(clienteA);
        contaCorrenteA.deposita(100.0);

        Cliente clienteB = new Cliente();

        clienteB.setNome("B");

        Conta contaPoupancaA = new ContaPoupanca(2, 2);

        contaPoupancaA.setTitular(clienteB);
        contaPoupancaA.deposita(200.0);

        Cliente clienteC = new Cliente();

        clienteC.setNome("C");

        Conta contaCorrenteB = new ContaCorrente(3, 3);

        contaCorrenteB.setTitular(clienteC);
        contaCorrenteB.deposita(300.0);

        Cliente clienteD = new Cliente();

        clienteD.setNome("D");

        Conta contaPoupancaB = new ContaPoupanca(4, 4);

        contaPoupancaB.setTitular(clienteD);
        contaPoupancaB.deposita(400.0);

        List<Conta> contaList = new ArrayList<>();

        contaList.add(contaCorrenteA);
        contaList.add(contaPoupancaA);
        contaList.add(contaCorrenteB);
        contaList.add(contaPoupancaB);

        contaList.sort(Comparator.comparingInt(Conta::getNumero));

        System.out.println("Organizar por número");

        contaList.forEach((conta) -> System.out.println(conta.getNumero() + " - " + conta.getTitular().getNome()));

        Comparator<Conta> comparator = (Conta contaA, Conta contaB) -> {
            String nomeA = contaA.getTitular().getNome();
            String nomeB = contaB.getTitular().getNome();

            return nomeB.compareTo(nomeA);
        };

        contaList.sort(comparator);

        System.out.println("Organizar por nome (Z -> A)");

        contaList.forEach((conta) -> System.out.println(conta.getNumero() + " - " + conta.getTitular().getNome()));
    }
}

