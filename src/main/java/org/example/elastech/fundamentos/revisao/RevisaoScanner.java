package org.example.elastech.fundamentos.revisao;

import java.util.Scanner;

public class RevisaoScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pergunte o nome da pessoa e responda: "Olá, [nome]!"
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!\n");

        // 2. Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("No próximo aniversário você fará " + (idade + 1) + " anos.\n");

        // 3. Pergunte dois números e mostre a soma
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("A soma é: " + (num1 + num2) + "\n");

        // 4. Pergunte a altura e o peso e imprima os dois numa frase
        System.out.print("Digite a sua altura (ex: 1.70): ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o seu peso (ex: 65.50): ");
        double peso = scanner.nextDouble();
        System.out.printf("Você tem %.2fm de altura e pesa %.1fkg.%n", altura, peso);

        /*Mini-desafio — Faça um programa que peça, nesta ordem: a idade (número), o nome (texto) e a cidade (texto). Depois imprima tudo numa ficha.
        Rode primeiro sem nenhum cuidado especial e veja o que acontece com a pergunta do nome. Quando você digita um número e aperta Enter, o nextInt() pega o número e deixa o Enter para trás. O nextLine() seguinte encontra esse Enter e acha que você não digitou nada.
         */
        System.out.print("Digite a sua idade: ");
        int idade2 = scanner.nextInt();

        // Limpeza de buffer: consome o Enter deixado para trás pelo nextInt()
        scanner.nextLine();

        System.out.print("Digite o seu nome completo: ");
        String nome2 = scanner.nextLine();

        System.out.print("Digite a sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("\n--- FICHA CADASTRAL ---");
        System.out.println("Nome:   " + nome2);
        System.out.println("Idade:  " + idade2 + " anos");
        System.out.println("Cidade: " + cidade);
        System.out.println("-----------------------");

        scanner.close();
    }
}
