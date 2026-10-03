package org.example.elastech.fundamentos.excecoes;

import java.util.Scanner;

public class PosicaoArray {
    /*
    2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas ={10, 7, 8, 9 , 6};

        System.out.println("Digite a posição da nota que deseja visualizar:");
        int posicao = scanner.nextInt();

        try {
            System.out.println("A nota é: " + notas[posicao]);
        }catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Essa posição não existe. O array vai de 0 a 4.");
        }finally {
            scanner.close();
        }

    }
}
