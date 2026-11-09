package org.example.elastech.fundamentos.lambda.parte2;

public class Main {
    public static void main(String[] args) {
        repetirAcao(() -> System.out.println("Oi"));

        mostrarResultado((valor) -> valor* 2, 5);

        // Primeira chamada: valor 4 (é par, então deve executar a ação)

        System.out.println("Testando com o valor 4");
        executarSe(
                n -> n % 2 == 0,           // Condição "é par" usando Lambda
                4,    // Valor
                () -> System.out.println("é par!") // Ação usando Lambda
                 );

        // Segunda chamada: valor 7 (é ímpar, então nada vai acontecer)

        System.out.println("Testando com o valor 7");
        executarSe(n -> n % 2 == 0,
                7,
                () -> System.out.println("é par!"));

        System.out.println("(Fim do teste com 7 - nada foi impresso acima)");


    }
    //Interface Acao com void executar().
    //Crie um metodo static void repetir(Acao acao) que chama acao.executar() duas vezes.
    //No main, chame repetir passando uma lambda que imprime "oi".
    //Repare que você não cria variável, a lambda vai direto como argumento.

    static void repetirAcao(Acao acao){
        acao.executar();
        acao.executar();
    }

    static void mostrarResultado(Operacao operacao, int valor){
        System.out.println(operacao.aplicar(valor));
    }

    static void executarSe(Condicao condicao, int valor, Acao acao){
        if (condicao.testar(valor)){
            acao.executar();
        }
    }
}
