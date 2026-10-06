package org.example.elastech.fundamentos.revisao;

public class RevisaoVariaveis {
    //Variáveis e tipos
    public static void main(String[] args) {

        //Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma.
        String nome = "Daphne";
        int idade = 26;
        double altura = 1.69;
        boolean jaProgramou = true;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(jaProgramou);

        //Crie uma variável cidade e imprima: "Eu moro em Salvador."
        String cidade = "Salvador";

        System.out.println("Eu moro em " + cidade + ".");

        //Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.
        String primeiroNome = "Eloise";
        String sobrenome = "Bridgerton";

        System.out.println(primeiroNome + " " + sobrenome);

        //Crie uma variável preço com 29.90 e imprima o valor dela numa frase.
        double preco = 29.90;

        System.out.printf("O preço é de R$%.2f.%n", preco);

        //Crie uma variável temCarteira com true e imprima.
        boolean temCareira = true;

        System.out.println("Você possui carteira de motorista? " + temCareira);

        //Mini-desafio — Você tem a = 10 e b = 20. Faça a valer 20 e b valer 10, sem escrever os números 10 e 20 de novo.
        // Se você fizer a = b, o valor antigo de A se perde. Você vai precisar de uma terceira variável pra guardar alguma coisa antes.

        int a = 10;
        int b = 20;
        int temporaria;

        temporaria = a;
        a = b;
        b = temporaria;

    }
}

