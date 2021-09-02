package model;

public class GuardadorDeContas {

    private int posicaoLivre;

    private Conta[] referencias;

    // constructors

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    // getters and setters

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }

    // methods

    public void adiciona(Conta conta) {
        this.referencias[this.posicaoLivre] = conta;
        this.posicaoLivre++;
    }
}
