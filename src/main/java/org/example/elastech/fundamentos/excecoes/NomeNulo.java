package org.example.elastech.fundamentos.excecoes;

public class NomeNulo {
    /*
    4 — Crie uma variável String nome = null; e tente imprimir nome.length(). Trate a NullPointerException e mostre "O nome não foi preenchido."
     */
    public static void main(String[] args) {
        String nome = null;

        try {
            System.out.println(nome.length());
        }catch (NullPointerException npe){
            System.out.println("O nome não foi preenchido.");
        }
    }
}
