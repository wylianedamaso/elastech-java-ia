package org.example.elastech.fundamentos.lambda.parte3;

import java.util.function.Supplier;

public class EntendendoLambda {
    //Runnable não recebe nada, não devolve nada.
    //Crie uma Runnable que imprima "executando tarefa". Declare numa variável, execute com .run().
    //Depois crie uma segunda Runnable e execute as duas em sequência no main.
    Runnable acao = () -> System.out.println("Executando tarefa");

    //Consumer algo entra, nada sai.
    //Crie um Consumer<String> que receba um nome e imprima "Olá, " + nome.
    //Use com .accept("Flora").
    //Depois crie um segundo Consumer<String> que imprima o nome em maiúsculo, e use .andThen() pra encadear os dois — repare que a ordem importa.


    //Supplier nada entra, algo sai
    //Crie um Supplier<String> que devolva o texto "Aviso: O sistema está online!". Chame o metodo .get() e imprima o resultado.
    //Crie um Supplier<Integer> que gere e devolva um número aleatório (use new Random().nextInt(100)). Chame o .get() duas vezes seguidas e imprima os resultados para ver que ele gera números diferentes a cada chamada.

    Supplier<String> avisoSistema = () -> "O sistema esta fora de ar";

}
