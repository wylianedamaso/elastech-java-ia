package org.example.elastech.fundamentos.arrays;

import java.util.Scanner;

public class EntradaUsuario {

/*4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.
Referências:
int[] notas = {8, 6, 10, 7, 9};
int[] notas = new int[5]
•for(int i = 0; i< notas.length; i++){
System.out.println(notas[i]);
}
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numero = new int[5];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numero[i] = scanner.nextInt();
        }
        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.println(numero[i]);
        }

        scanner.close();

    }
}
