package org.example.elastech.fundamentos.collections;

import java.util.ArrayList;
import java.util.List;

public class EntendendoArrayList {
    public static void main(String[] args) {
        /*.add(1); Adiciona no fim da lista

        .get(); Pegar - Buscar - Acessar
        .size(); Mostra o tamanho
        .contains(); Verifica se contém aquele valor
        .indexOf(); Mostra a posição do valor informado
        .remove(); Remove
        .set(); Modifica ou Altera
        .isEmpty(); Verifica se está vazia
        .addAll(List.of()); Adicionar todas lista de .. (Adiciona vários de uma vez)
        .add(1, 78) adiciona em uma posição expecifica
        ArrayList<Integer> lista = new ArrayList<>(List.of(1,2,3));*/

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(10);
        lista.add(100);
        lista.add(1000);

        lista.add(1, 20);
        System.out.println(lista);

        lista.addAll(List.of(125, 2, 35, 765, 238,94));
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);
        System.out.println(lista.get(2));
        lista.set(1, 98);
        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println(lista.contains(98));
        System.out.println(lista.indexOf(98));
        System.out.println(lista.isEmpty());

    }
}
