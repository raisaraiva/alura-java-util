package model;

import model.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        saldo += valor;
    }

    @Override
    public void saque(double valor) throws SaldoInsuficienteException {
        super.saque(valor + 0.2);
    }

    @Override
    public double getValorImposto() {
        return saldo * 0.01;
    }
}
