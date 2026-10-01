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

        System.out.println("Digite o primeiro número:");
        numero[0] = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o segundo número:");
        numero[1] = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o terceiro número:");
        numero[2] = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o quarto número:");
        numero[3] = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o último número:");
        numero[4] = scanner.nextInt();
        scanner.nextLine();

        for (int i = 4 ; i >= 0 ; i--){
            System.out.println(numero[i]);
        }

    }
}
