package org.example.elastech.fundamentos.excecoes;

public class TratandoExcecoes {
    public static void main(String[] args) {

        try {

            int resultado = 10 / 0;
            System.out.println("O resultado é " + resultado);

        }catch (ArithmeticException ae){
            System.out.println("Não se divide  por zero!");

        } finally {
            System.out.println("Isso sempre roda.");
        }

        System.out.println("O programa continua..");
    }
}

