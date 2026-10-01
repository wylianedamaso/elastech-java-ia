package org.example.elastech.fundamentos.entradadados;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escreva seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Seu nome é " + nome);




    }
}
