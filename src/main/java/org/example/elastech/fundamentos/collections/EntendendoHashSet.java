package org.example.elastech.fundamentos.collections;

import java.util.HashSet;
import java.util.List;

public class EntendendoHashSet {
    public static void main(String[] args) {
            /*
        Set (Conjuntos): Coleções que não permitem elementos duplicados.

        HashSet:
        - Não garante ordem dos elementos
        - Guarda valores
        - Não permite elementos duplicados
        - Tem boa performance para operações de busca

        .add("Ana"); adiciona um elemento
        .addAll(List.of("Ana", "Bia")); adiciona vários elementos
        .contains("Ana"); verifica se contém o elemento
        .remove("Ana"); remove um elemento
        .size(); mostra o tamanho
        .isEmpty(); verifica se está vazio
        .clear(); remove todos os elementos
        */

        HashSet<String> set = new HashSet<>();


        set.add("Flora");
        set.add("Anne");
        set.add("Mary");

        System.out.println(set);

        set.add("Flora");
        System.out.println(set);

        set.addAll(List.of("Natalia", "Giovana", "Anne"));
        System.out.println(set);

        System.out.println(set.contains("Mary"));

        set.remove("Mary");
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());

    }
}
