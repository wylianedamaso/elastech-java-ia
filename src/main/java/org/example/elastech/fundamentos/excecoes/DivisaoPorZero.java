package org.example.elastech.fundamentos.excecoes;

import java.util.Scanner;

public class DivisaoPorZero {
    /*1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        System.out.println("Digite o primeiro número:");
        primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        segundoNumero = scanner.nextInt();
        try {
            System.out.println("A divisão do número " + primeiroNumero + " e do segundo número " + segundoNumero + " é de: " + (primeiroNumero / segundoNumero));
        }catch (ArithmeticException ae){
            System.out.println("Não é possível dividir por zero!");
        }finally {
            scanner.close();
        }

    }

}
