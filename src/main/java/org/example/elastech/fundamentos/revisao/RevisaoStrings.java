package org.example.elastech.fundamentos.revisao;

import java.util.Scanner;

public class RevisaoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Peça o nome completo e mostre quantas letras ele tem.
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Total de caracteres: " + nomeCompleto.length());

        // 2. Peça o nome e mostre em MAIÚSCULO e em minúsculo.
        System.out.print("\nDigite um nome: ");
        String nome = scanner.nextLine();
         System.out.println("Maiúsculo: " + nome.toUpperCase());
        System.out.println("Minúsculo: " + nome.toLowerCase());

        // 3. Peça o nome e mostre a primeira letra.
        if (!nome.isEmpty()) {
            System.out.println("Primeira letra: " + nome.charAt(0));
        }

        // 4. Peça uma frase e uma palavra. Diga se a palavra aparece na frase.
        System.out.print("\nDigite uma frase: ");
        String frase = scanner.nextLine();
        System.out.print("Digite uma palavra para buscar: ");
        String palavra = scanner.nextLine();
        if (frase.contains(palavra)) {
            System.out.println("Sim! A palavra aparece na frase.");
        } else {
            System.out.println("Não. A palavra não está na frase.");
        }

        // 5. Peça o nome duas vezes e diga se os dois são iguais, ignorando maiúsculas.
        System.out.print("\nDigite o primeiro nome: ");
        String n1 = scanner.nextLine();
        System.out.print("Digite o segundo nome: ");
        String n2 = scanner.nextLine();
        if (n1.equalsIgnoreCase(n2)) {
            System.out.println("Os nomes são iguais!");
        } else {
            System.out.println("Os nomes são diferentes.");
        }

        // 6. Peça um nome e mostre em maiúsculo, sem espaços nas pontas (dois métodos encadeados).
        System.out.print("\nDigite um nome com espaços extras: ");
        String comEspacos = scanner.nextLine();
        System.out.println("Tratado: [" + comEspacos.trim().toUpperCase() + "]");

        /* Mini-desafio — Peça uma palavra e diga se ela começa e termina com a mesma letra, ignorando maiúscula.
           Exemplos: ana → sim · Ovo → sim · casa → não
        */
        System.out.println("\n--- MINI-DESAFIO: MESMA LETRA ---");
        System.out.print("Digite uma palavra: ");
        String palavraDesafio = scanner.nextLine().toLowerCase();

        if (!palavraDesafio.isEmpty()) {
            char primeiraLetra = palavraDesafio.charAt(0);
            char ultimaLetra = palavraDesafio.charAt(palavraDesafio.length() - 1);

            if (primeiraLetra == ultimaLetra) {
                System.out.println("Sim! Começa e termina com a mesma letra (" + primeiraLetra + ").");
            } else {
                System.out.println("Não. Começa com " + primeiraLetra + " e termina com " + ultimaLetra + ".");
            }
        }

        scanner.close();
    }
}