package org.example.elastech.fundamentos.collections;

import java.util.ArrayDeque;
import java.util.List;

public class EntendendoQueue {
    public static void main(String[] args) {
        /*   Filas (Queues): Seguem o princípio FIFO
        (First In, First Out — o primeiro que entra é o primeiro que sai).

        Queue é a ideia/regra de uma fila. Já ArrayDeque é uma classe que implementa esse comportamento.

        .add("Ana"); adiciona no fim da fila
        .addAll(List.of("Ana", "Bia")); adiciona vários elementos
        .peek(); espia/mostra o primeiro da fila sem remover
        .poll(); remove e retorna o primeiro da fila
        .contains("Bia"); verifica se contém o elemento
        .size(); mostra o tamanho da fila
        .isEmpty(); verifica se a fila está vazia
        */

        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.add("Flora");
        fila.add("Anne");
        fila.addAll(List.of("Mary", "Natália", "Giovana"));

        System.out.println(fila);

        System.out.println(fila.peek());
        System.out.println(fila);

        System.out.println(fila.poll());
        System.out.println(fila);

        System.out.println(fila.contains("Mary"));
        System.out.println(fila.size());
        System.out.println(fila.isEmpty());

    }

}
