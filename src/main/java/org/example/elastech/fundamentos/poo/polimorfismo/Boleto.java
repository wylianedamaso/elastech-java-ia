package org.example.elastech.fundamentos.poo.polimorfismo;

public class Boleto implements MeioDePagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Boleto gerado no valor de R$ %.2f.%n", valor);
    }
}
