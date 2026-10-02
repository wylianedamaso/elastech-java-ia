package org.example.elastech.fundamentos.metodos;

public class Utilidades {

    public static void saudar(String nome){

        System.out.println("Olá, " + nome + "! Tudo bem?");
    }

    public static int dobro(int numero){

        return (2 * numero);
    }

    public static double calcularMedia(double n1, double n2){

        return (n1 + n2) / 2;
    }

    public static boolean ehMaiorDeIdade(int idade){

        return idade >= 18;
    }

    public static int somar(int n1, int n2){

        return (n1 + n2);
    }
    public static int somar(int n1, int n2, int n3){

        return (n1 + n2 + n3);
    }
    public static double somar(double n1, double n2){

        return (n1 + n2);
    }

    public static void saudacao(){

        System.out.println("Olá!");
    }
    public static  void saudacao(String nome){

        System.out.println("Olá, " + nome + "!");
    }


}
