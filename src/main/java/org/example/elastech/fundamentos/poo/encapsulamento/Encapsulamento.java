package org.example.elastech.fundamentos.poo.encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("");
        System.out.println("Titular atual: " + conta.getTitular());

        conta.setTitular("Ana");
        System.out.println("Titular atual: " + conta.getTitular());

        System.out.println("Saldo inicial: " + conta.getSaldo());

        conta.depositar(500.00);
        System.out.println("Saldo: " + conta.getSaldo());

        conta.depositar(-100.00);

        conta.sacar(2000.00);

        conta.sacar(200.00);
        System.out.println("Saldo: " + conta.getSaldo());

        //conta.registrarLog("teste", 100.00);

        Produto produto = new Produto();

        System.out.println(produto.nome);
        System.out.println(produto.categoria);
        System.out.println(produto.preco);
        //System.out.println(produto.codigoInterno); - Acesso privado.

       // System.out.println(conta.setNumeroConta("999-Z"); - Como não tem o metod setNumeroConta em conta bancaria o código nem roda aqui.
    }

}
