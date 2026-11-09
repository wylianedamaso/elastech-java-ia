package org.example.elastech.fundamentos.tdd;

public class CalculadoraDesconto {
    public double aplicarDesconto(double valorCompra, boolean clienteVip) {

        if (valorCompra <= 0) {
            throw new IllegalArgumentException("Valor da compra inválido");
        }

        if (clienteVip) {
            return valorCompra * 0.90;
        }

        if (valorCompra < 100) {
            return valorCompra;
        }

        return valorCompra * 0.90;
    }
}
