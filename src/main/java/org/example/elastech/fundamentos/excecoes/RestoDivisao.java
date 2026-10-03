package org.example.elastech.fundamentos.excecoes;

import java.util.Scanner;

public class RestoDivisao {
    /*
    5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        try {
            int resto = 100 % numero;
            System.out.println("O resto é: " + resto);
        }catch (ArithmeticException ae){
            System.out.println("Não é possível calcular o resto da divisão por zero.");
        }finally {
            scanner.close();
        }
    }
}
