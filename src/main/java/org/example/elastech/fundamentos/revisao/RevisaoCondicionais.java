package org.example.elastech.fundamentos.revisao;

import java.util.Scanner;

public class RevisaoCondicionais {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Peça a idade e diga se a pessoa é maior ou menor de idade.
            System.out.print("Digite sua idade para verificar maioridade: ");
            int idade = scanner.nextInt();
            if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade.");
            }

            // 2. Peça um número e diga se ele é par ou ímpar.
            System.out.print("\nDigite um número inteiro: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                System.out.println("O número é PAR.");
            } else {
                System.out.println("O número é ÍMPAR.");
            }

            // 3. Peça dois números e diga qual é o maior. Se forem iguais, avise.
            System.out.print("\nDigite o primeiro número: ");
            double n1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double n2 = scanner.nextDouble();

            if (n1 > n2) {
                System.out.println("O maior número é: " + n1);
            } else if (n2 > n1) {
                System.out.println("O maior número é: " + n2);
            } else {
                System.out.println("Os dois números são iguais!");
            }

            // 4. Peça uma nota e mostre "Aprovada" (7 ou mais), "Recuperação" (5 a 6.9) ou "Reprovada".
            System.out.print("\nDigite a nota da aluna: ");
            double nota = scanner.nextDouble();
            if (nota >= 7.0) {
                System.out.println("Aprovada!");
            } else if (nota >= 5.0) {
                System.out.println("Recuperação.");
            } else {
                System.out.println("Reprovada.");
            }

            // 5. Peça um número de 1 a 3 e, usando switch, mostre um sabor de sorvete pra cada opção.
            System.out.print("\nEscolha um sabor (Digite 1, 2 ou 3): ");
            int saborOpcao = scanner.nextInt();
            switch (saborOpcao) {
                case 1:
                    System.out.println("Sabor escolhido: Chocolate");
                    break;
                case 2:
                    System.out.println("Sabor escolhido: Morango");
                    break;
                case 3:
                    System.out.println("Sabor escolhido: Pistache");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            // 6. Peça a idade e diga o valor do ingresso: menos de 12 ou 60 ou mais paga R$ 10; o resto paga R$ 25.
            System.out.print("\nDigite sua idade para calcular o ingresso: ");
            int idadeIngresso = scanner.nextInt();
            if (idadeIngresso < 12 || idadeIngresso >= 60) {
                System.out.println("Valor do ingresso: R$ 10,00");
            } else {
                System.out.println("Valor do ingresso: R$ 25,00");
            }

        /*  Mini-desafio — Peça os três lados de um triângulo e classifique:
           - Todos iguais → Equilátero
           - Dois iguais → Isósceles
           - Todos diferentes → Escaleno
            Dica: Teste o Equilátero PRIMEIRO, senão ele cai na regra do isósceles antes.
        */
            System.out.println("\n--- MINI-DESAFIO: TRIÂNGULOS ---");
            System.out.print("Digite o lado A: ");
            double ladoA = scanner.nextDouble();
            System.out.print("Digite o lado B: ");
            double ladoB = scanner.nextDouble();
            System.out.print("Digite o lado C: ");
            double ladoC = scanner.nextDouble();

            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triângulo Equilátero (todos os lados iguais).");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Triângulo Isósceles (dois lados iguais).");
            } else {
                System.out.println("Triângulo Escaleno (todos os lados diferentes).");
            }

            scanner.close();
        }
}

