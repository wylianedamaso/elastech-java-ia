package org.example.elastech.fundamentos.entradadados;

import java.util.Scanner;

public class EntradaDeDados { /*
1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."

2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.

3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.

4 - Peça um número e mostre a tabuada dele de 1 a 10.
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escreva seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos e vai fazer " + (idade+1) + " no próximo aniversário.");




    }
}
