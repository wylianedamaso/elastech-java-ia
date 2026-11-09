package org.example.elastech.fundamentos.padroes.comportamentais.strategy;

public class Compra {
    private Desconto desconto;

    public Compra(Desconto desconto){
        this.desconto = desconto;
    }

    public double calcularPrecoFinal(double valor){
        return valor - desconto.calcularDesconto(valor);
    }
}