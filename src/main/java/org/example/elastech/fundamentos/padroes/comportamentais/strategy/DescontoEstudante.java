package org.example.elastech.fundamentos.padroes.comportamentais.strategy;

public class DescontoEstudante implements Desconto{
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.10;
    }
}
