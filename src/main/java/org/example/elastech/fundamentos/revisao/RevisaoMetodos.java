package org.example.elastech.fundamentos.revisao;

public class RevisaoMetodos {

    // 1. Crie um método mostrarBoasVindas() que imprime uma mensagem.
    public static void mostrarBoasVindas() {
        System.out.println("Seja muito bem-vinda ao sistema de métodos Java!");
    }

    // 2. Crie saudacao(String nome) que imprime "Olá, [nome]!".
    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    // 3. Crie dobro(int numero) que devolve o dobro.
    public static int dobro(int numero) {
        return numero * 2;
    }

    // 4. Crie calcularMedia(double n1, double n2) que devolve a média.
    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    // 5. Crie ehPar(int numero) que devolve true ou false.
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    // 6. Sobrecarga de métodos (dois métodos somar)
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Mini-desafio métodos
    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    public static void liberarEntrada(int idade) {
        if (ehMaiorDeIdade(idade)) {
            System.out.println("Acesso permitido: Maior de idade.");
        } else {
            System.out.println("Acesso negado: Menor de idade.");
        }
    }

    public static void main(String[] args) {
        // Chamando 1
        mostrarBoasVindas();

        // Chamando 2
        System.out.println();
        saudacao("Ana");
        saudacao("Bruno");
        saudacao("Carlos");

        // Chamando 3
        System.out.println("\nO dobro de 7 é: " + dobro(7));

        // Chamando 4
        System.out.printf("A média é: %.2f%n", calcularMedia(8.5, 7.0));

        // Chamando 5
        int numTestado = 4;
        if (ehPar(numTestado)) {
            System.out.println(numTestado + " é par.");
        } else {
            System.out.println(numTestado + " é ímpar.");
        }

        // Chamando 6 (Somar)
        System.out.println("Soma de 2 números (5 + 3): " + somar(5, 3));
        System.out.println("Soma de 3 números (2 + 4 + 6): " + somar(2, 4, 6));

        // Chamando Mini-desafio
        System.out.println("\n--- MINI-DESAFIO DE MÉTODOS ---");
        liberarEntrada(20);
        liberarEntrada(15);
    }
}