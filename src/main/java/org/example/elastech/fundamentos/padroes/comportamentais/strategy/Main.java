package org.example.elastech.fundamentos.padroes.comportamentais.strategy;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {


    Compra compra = new Compra(new DescontoEstudante());

        System.out.println(compra.calcularPrecoFinal(100));
        //90,00
        compra = new Compra(new DescontoVIP());

        System.out.println(compra.calcularPrecoFinal(100));
        //80,00
    }
}
