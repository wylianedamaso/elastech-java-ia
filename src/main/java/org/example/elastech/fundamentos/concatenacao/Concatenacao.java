package org.example.elastech.fundamentos.concatenacao;

public class Concatenacao {
    public static void main(String[] args) {
        /*1- Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha:
        "Meu nome é Ana, moro em Salvador e tenho 28 anos."
        */
        String nome = "Ana";
        String cidade = "Salvador";
        int idade = 28;

        System.out.println("Meu nome é " + nome + " moro em " + cidade + " e tenho " + idade + " anos.");

        /*2 — Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4).
         Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"
         */
        String nomeDoProduto = "Caneca";
        int quantidade = 4;
        double preco = 12.50;

        System.out.println("Comprei " + quantidade + " unidades de " + nomeDoProduto + " por R$" + preco + " cada. Total: R$" + (quantidade * preco) + ".");

        //3- Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim: "A soma de 15 e 4 é igual a 19."
        int numero1 = 15;
        int numero2 = 4;

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + (numero1 + numero2) + ".");

        /* 0- Rode esse código:
         System.out.println("2 + 2 = " + 2 + 2);.
         Agora rode:
         System.out.println("2 + 2 = " + (2 + 2));
         Explique em um comentário por que deram resultados diferentes.
         */
        System.out.println("2 + 2 = " + 2 + 2);
        //Aqui ele fez a concatenação como um texto e não a soma dos valores.

        System.out.println("2 + 2 = " + (2 + 2));
        //Aqui como os valores estão entre parenteses a soma dos números é feita antes da concatenação sem transformar os números em "texto".

        //1- Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.
        int numeroA = 10;
        int numeroB = 3;

        System.out.println("Inteiros");
        System.out.println("Soma: " + (numeroA + numeroB));
        System.out.println("Subtração: " + (numeroA - numeroB));
        System.out.println("Multiplicação: " + (numeroA * numeroB));
        System.out.println("Divisão: " + (numeroA / numeroB));
        System.out.println("Resto: " + (numeroA % numeroB));

        //2- Crie variáveis para dois números decimais de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.
        double numeroI = 10;
        double numeroII = 3;

        System.out.println("Decimais");
        System.out.println("Soma: " + (numeroI + numeroII));
        System.out.println("Subtração: " + (numeroI - numeroII));
        System.out.println("Multiplicação: " + (numeroI * numeroII));
        System.out.println("Divisão: " + (numeroI / numeroII));
        System.out.println("Resto: " + (numeroI % numeroII));

        //3- Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.
        int nota1 = 8;
        int nota2 = 6;
        int nota3 = 10;

        System.out.println("A soma das notas é: " + (nota1 + nota2 + nota3) + " e a média das notas é: " + (nota1 + nota2 + nota3) / 3);

        //4- Faça a operação a + b * c, sendo a = 3, b = 4 e c = 5.
        int a = 3;
        int b = 4;
        int c = 5;

        System.out.println("Resultado da operação a + b * c é: " + (a + b * c));

        //5- Faça a operação (a + b) * c, sendo a = 3, b = 4 e c = 5.

        System.out.println("Resultado da operação (a + b) * c é: " + (a + b) * c);

        /*Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.
         Dica: segundos/60 dá os minutos. Segundos % 60 mostra os segundos restantes.
        */
        int segundosTotais = 3785;
        int minutos = segundosTotais / 60;
        int segundosRestantes = segundosTotais % 60;

        System.out.println("Minutos inteiros: " + minutos + ". Segundos restantes: " + segundosRestantes +
                " equivalente a 1 hora, 3 minutos e 5 segundos.");

    }

}
