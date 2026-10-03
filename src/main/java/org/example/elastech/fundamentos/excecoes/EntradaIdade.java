package org.example.elastech.fundamentos.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaIdade {
    /*
    3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        try {
            int idade = scanner.nextInt();
            System.out.println("Sua idade é " + idade);
        }catch (InputMismatchException ime){
            System.out.println("Você precisa informar um número");
        }finally {
            scanner.close();
        }
    }
}
