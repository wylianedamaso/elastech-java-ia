package org.example.elastech.fundamentos.lambda.parte1;

public class Main {
    public static void main(String[] args) {

        //variável do Tipo da interface = corpo da lambda
        Saudacao saudacao = () -> System.out.println("Oi");

        saudacao.executar();


        //Crie duas variáveis diferentes desse tipo usando duas lambdas — uma que imprime o texto em maiúsculo, outra que imprime em minúsculo. Chame as duas.

        Impressora impressora = (texto) -> System.out.println(texto.toUpperCase());

        Impressora novaImpressora = (String texto) -> System.out.println(texto.toLowerCase());

        impressora.imprimir("Impressora Maiúscula");
        novaImpressora.imprimir("Impressora Minúscula");

        //Interface Calculo com int calcular(int a, int b).
        //Crie três lambdas: soma, multiplicação e a que retorna o maior dos dois. Chame as três e imprima os resultados.

        Calculo soma = (a,b) -> (a + b);

        Calculo multiplicacao = (a,b) -> a * b;

        Calculo maiorQue= (a,b) -> Math.max(a, b);

        System.out.println(soma.calcular(3,4));

        System.out.println(multiplicacao.calcular(5,10));
        System.out.println(maiorQue.calcular(10,8));
    }
}
