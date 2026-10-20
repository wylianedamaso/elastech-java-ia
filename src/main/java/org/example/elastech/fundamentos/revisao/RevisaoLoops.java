package org.example.elastech.fundamentos.revisao;

import java.util.Scanner;
public class RevisaoLoops {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Imprima os números de 1 a 20, um por linha.
            System.out.println("--- Números de 1 a 20 ---");
            for (int i = 1; i <= 20; i++) {
                System.out.println(i);
            }

            // 2. Imprima a contagem regressiva de 10 até 1 e depois "Fim!".
            System.out.println("--- Contagem Regressiva ---");
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
            }
            System.out.println("Fim!");

            // 3. Peça um número e mostre a tabuada dele de 1 a 10.
            System.out.print("\nDigite um número para ver a tabuada: ");
            int numTabuada = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(numTabuada + " x " + i + " = " + (numTabuada * i));
            }

            // 4. Imprima só os números pares de 1 a 30.
            System.out.println("\n--- Números pares de 1 a 30 ---");
            for (int i = 1; i <= 30; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            // 5. Usando for, some todos os números de 1 a 100 e mostre o resultado.
            int somaTotal = 0;
            for (int i = 1; i <= 100; i++) {
                somaTotal += i;
            }
            System.out.println("\nA soma de 1 a 100 é: " + somaTotal);

            // 6. Refaça o primeiro exercício (1 a 20) com while.
            System.out.println("\n--- 1 a 20 com While ---");
            int contador = 1;
            while (contador <= 20) {
                System.out.println(contador);
                contador++;
            }

            // 7. Crie energia = 3. Usando do-while, imprima "Jogando..." e diminua 1 enquanto for maior que 0.
            System.out.println("\n--- Simulação de Energia ---");
            int energia = 3;
            do {
                System.out.println("Jogando... Energia restante: " + energia);
                energia--;
            } while (energia > 0);

        /* Mini-desafio — Desenhar um triângulo de asteriscos com laços aninhados.
           O laço de fora controla as linhas, o de dentro imprime os asteriscos daquela linha.
        */
            System.out.println("\n--- MINI-DESAFIO: TRIÂNGULO DE ASTERISCOS ---");
            System.out.print("Digite a altura do triângulo: ");
            int alturaTriangulo = scanner.nextInt();

            for (int linha = 1; linha <= alturaTriangulo; linha++) {
                for (int asterisco = 1; asterisco <= linha; asterisco++) {
                    System.out.print("*");
                }
                System.out.println(); // Pula para a próxima linha
            }

            scanner.close();
        }
}
