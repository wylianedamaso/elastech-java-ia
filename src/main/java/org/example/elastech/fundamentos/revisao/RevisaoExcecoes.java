package org.example.elastech.fundamentos.revisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RevisaoExcecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Peça dois números e mostre a divisão. Trate o caso de a pessoa digitar 0 no segundo.
        System.out.println("--- Divisão Segura ---");
        try {
            System.out.print("Digite o numerador: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o denominador: ");
            int num2 = scanner.nextInt();

            int divisao = num1 / num2;
            System.out.println("Resultado da divisão: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!");
        }

        // 2. Crie um array com 5 notas. Peça uma posição e mostre a nota. Trate posição inválida.
        System.out.println("\n--- Acesso a Array ---");
        double[] notas = {8.0, 9.5, 7.0, 6.5, 10.0};
        try {
            System.out.print("Digite a posição que deseja consultar (0 a 4): ");
            int posicao = scanner.nextInt();
            System.out.println("Nota na posição " + posicao + ": " + notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Posição inválida no array!");
        }

        // 3. Peça a idade com nextInt(). Trate o caso de a pessoa digitar texto.
        System.out.println("\n--- Leitura Segura de Número ---");
        try {
            System.out.print("Digite sua idade (número): ");
            int idade = scanner.nextInt();
            System.out.println("Sua idade é: " + idade);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Você digitou texto em vez de um número inteiro!");
        }

        // Limpa o buffer caso tenha ficado lixo
        scanner.nextLine();

        // 4. Crie String nome = null; e tente imprimir nome.length(). Trate a exceção.
        System.out.println("\n--- Null Pointer Exception ---");
        try {
            String nome = null;
            System.out.println("Tamanho do nome: " + nome.length());
        } catch (NullPointerException e) {
             System.out.println("Erro: Tentativa de acessar método em uma variável nula (null).");
        }

        // 5. Crie um array com 3 nomes e tente imprimir a posição 5. Trate e imprima mensagem depois.
        System.out.println("\n--- Continuidade após Exceção ---");
        try {
            String[] nomes = {"Ana", "Bia", "Leo"};
            System.out.println(nomes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceção capturada: Índice fora dos limites.");
        }
        System.out.println("O programa continua funcionando normalmente após o try-catch.");

        /*  Mini-desafio — Try com três catch diferentes
           (Atenção: o catch (Exception e) genérico precisa vir SEMPRE por último!)
        */
        System.out.println("\n--- MINI-DESAFIO: MÚLTIPLOS CATCH ---");
        try {
            // Simulando um erro de divisão por zero ou array
            int[] valores = {10, 20};
            System.out.println(valores[10] / 0);
        } catch (ArithmeticException e) {
            System.out.println("Capturado: Erro aritmético (Divisão por zero).");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturado: Posição de array inválida.");
        } catch (Exception e) {
            System.out.println("Capturado: Erro genérico inesperado -> " + e.getMessage());
        }

        scanner.close();
    }
}