package org.example.elastech.fundamentos.arrays;

public class Notas {
    /*2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".
    3 — Com o mesmo array de notas, calcule e mostre a soma e a média.*/
    public static void main(String[] args) {

        int[] notas = {8, 6, 10, 7, 9};
        int soma = 0;

        for (int i = 0; i < notas.length ; i++){
            System.out.println("Nota " + (i+1) + ": " + notas[i] + ".");
            soma += notas[i];

       }

        System.out.println("Soma das notas: " + soma);

        double media = (double) soma / notas.length;

        System.out.println("Média das notas: " + media);

    }
}
