package org.example.elastech.fundamentos.excecoes;

public class PosicaoInexistente {
    /*
    6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."
     */
    public static void main(String[] args) {

        String[] nome = {"Ana" , "Maria" , "Bela"};

       try {
           System.out.println(nome[5]);
       }catch (ArrayIndexOutOfBoundsException aioobe){
           System.out.println("Essa posição não existe.");
       }

        System.out.println("O programa continua funcionando.");

    }

}
