package org.example.elastech.fundamentos.padroes.estruturais.decorator;

public abstract class CafeDecorator implements Cafe{
    protected Cafe cafeEmbrulhado;

    public CafeDecorator(Cafe cafe) {
        this.cafeEmbrulhado = cafe;
    }
}
