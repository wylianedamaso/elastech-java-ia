package org.example.elastech.fundamentos.revisao;

public class RevisaoConcatenacao {
    //Concatenação e printf

    public static void main(String[] args) {

        //Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."
        String nome = "Ana";
        int idade = 28;

        System.out.println(nome + " tem " + idade + " anos.");

        //Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.
        double nota1 = 8.0;
        double nota2 = 7.0;
        double media = (nota1 + nota2) / 2;

        System.out.printf("A média é %.2f.%n", media);

        //Crie uma variável com o preço de um produto e imprima com duas casas decimais.

        double precoProduto = 38.50;

        System.out.printf("Preço do produto R$%.2f.%n", precoProduto);

        //Usando printf, imprima numa linha só o nome, a idade e a altura.
        double altura = 1.69;
        System.out.printf("%s tem %d anos e %.2f de altura.%n", nome, idade, altura);

        /*Mini-desafio — Crie variáveis para três produtos (nome e preço) e imprima um recibo. Cada linha deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.
        Crie uma variável total começando em zero, antes dos produtos, e vá somando cada preço nela.
         */

        String produtoUm = "Cama";
        String produtoDois = "Mesa";
        String produtoTres = "Cadeira";

        double precoUm = 1490.99;
        double precoDois = 498.50;
        double precoTres = 259.98;

        double total = 0;

        total += precoUm;
        total += precoDois;
        total += precoTres;

        System.out.printf("%s : R$ %.2f%n", produtoUm, precoUm);
        System.out.printf("%s : R$ %.2f%n", produtoDois, precoDois);
        System.out.printf("%s : R$ %.2f%n", produtoTres, precoTres);
        System.out.printf("Valor total: R$ %.2f", total);
    }
}
