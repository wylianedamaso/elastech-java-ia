package org.example.elastech.fundamentos.padroes.comportamentais.strategy;

public class SemDesconto implements Desconto{
    @Override
    public double calcularDesconto(double valor) {
        return 0;
    }
}
