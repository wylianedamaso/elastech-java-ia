package org.example.elastech.fundamentos.revisao;

import java.util.Scanner;

public class RevisaoArrays {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o último.
            String[] nomes = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo"};
            System.out.println("Primeiro: " + nomes[0]);
            System.out.println("Terceiro: " + nomes[2]);
            System.out.println("Último: " + nomes[nomes.length - 1]);

            // 2. Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laço.
            int[] notas = {8, 6, 10, 7, 9};
            System.out.println("\n--- Notas do Array ---");
            for (int i = 0; i < notas.length; i++) {
                System.out.print(notas[i] + " ");
            }
            System.out.println();

            // 3. Com o mesmo array, calcule e imprima a soma e a média.
            int soma = 0;
            for (int nota : notas) {
                soma += nota;
            }
            double media = (double) soma / notas.length;
            System.out.println("Soma das notas: " + soma + " | Média: " + media);

            // 4. Crie um array com 5 números e descubra qual é o maior.
            int[] numeros = {12, 45, 7, 89, 23};
            int maior = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }
            }
            System.out.println("Maior número do array: " + maior);

            // 5. Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7.
            int[] notasFiltro = {8, 5, 10, 4, 7};
            int notasAltas = 0;
            for (int n : notasFiltro) {
                if (n >= 7) {
                    notasAltas++;
                }
            }
            System.out.println("Notas maiores ou iguais a 7: " + notasAltas);

        /* Mini-desafio — Crie um array com 5 nomes. Peça um nome pra pessoa e diga em qual posição ele está.
           Se não estiver, avise (usando a lógica do -1).
        */
            System.out.println("\n--- MINI-DESAFIO: BUSCA EM ARRAY ---");
            String[] listaNomes = {"Daphne", "Eloise", "Benedict", "Anthony", "Colin"};
            System.out.print("Digite um nome para buscar: ");
            String busca = scanner.nextLine();

            int posicao = -1;
            for (int i = 0; i < listaNomes.length; i++) {
                if (listaNomes[i].equalsIgnoreCase(busca)) {
                    posicao = i;
                    break; // Achou, pode parar o laço
                }
            }

            if (posicao != -1) {
                System.out.println("Nome encontrado na posição (índice): " + posicao);
            } else {
                System.out.println("Aviso: O nome não está na lista (-1).");
            }

            scanner.close();
        }
    }

