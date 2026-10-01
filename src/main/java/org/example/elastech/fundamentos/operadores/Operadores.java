package org.example.elastech.fundamentos.operadores;

public class Operadores {
    public static void main(String[] args) {
    /*Relacionais:
    1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de:
    são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
    - a = 10, b = 3
    - a = 3, b = 10
    - a = 5, b = 5
    */
        int notaA = 10;
        int notaB = 3;

        System.out.println("São iguais? " + (notaA == notaB));
        System.out.println("São diferentes? " + (notaA != notaB));
        System.out.println("A primeira é maior? " + (notaA > notaB));
        System.out.println("A primeira é menor?  " + (notaA < notaB));

        notaA = 3;
        notaB = 10;
        System.out.println("São iguais? " + (notaA == notaB));
        System.out.println("São diferentes? " + (notaA != notaB));
        System.out.println("A primeira é maior? " + (notaA > notaB));
        System.out.println("A primeira é menor?  " + (notaA < notaB));

        notaA = 5;
        notaB = 5;
        System.out.println("São iguais? " + (notaA == notaB));
        System.out.println("São diferentes? " + (notaA != notaB));
        System.out.println("A primeira é maior? " + (notaA > notaB));
        System.out.println("A primeira é menor?  " + (notaA < notaB));

        //2- Exiba na tela a == b, sendo a = 10 e b 3.
        int a = 10;
        int b = 3;
        System.out.println(a == b);
        //3- Exiba na tela a != b, sendo a = 10 e b = 3.
        System.out.println(a != b);

        //4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo
        boolean chovendo = true;

        System.out.println(!chovendo);
    }
}
