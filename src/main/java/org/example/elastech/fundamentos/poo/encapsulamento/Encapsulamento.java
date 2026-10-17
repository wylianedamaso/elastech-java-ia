package org.example.elastech.fundamentos.poo.encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("");
        System.out.println(conta.getTitular());
        conta.setTitular("Ana");
        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());


    }

}
