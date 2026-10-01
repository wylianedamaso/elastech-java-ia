package org.example.elastech.fundamentos.metodos;

public class Utilidades {

    static void saudar(String nome){
        System.out.println("Olá, " + nome + "! Tudo bem?");
    }

    static int dobro(int numero){
        return (2 * numero);
    }

    static double calcularMedia(double n1, double n2){

        return (n1 + n2) / 2;
    }

    static boolean ehMaiorDeIdade(int idade){
        return idade >= 18;
    }

    static int somar(int n1, int n2){
        return (n1 + n2);
    }
    static int somar(int n1, int n2, int n3){
        return (n1 + n2 + n3);
    }
    static double somar(double n1, double n2){
        return (n1 + n2);
    }

    static void saudacao(){
        System.out.println("Olá!");
    }
    static  void saudacao(String nome){
        System.out.println("Olá, " + nome + "!");
    }


}
