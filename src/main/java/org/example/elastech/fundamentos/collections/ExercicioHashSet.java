package org.example.elastech.fundamentos.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ExercicioHashSet {

    public static void main(String[] args) {
        //  1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu com o repetido.
        HashSet<String> set = new HashSet<>();

        set.add("Ana");
        set.add("Dani");
        set.add("Carla");
        set.add("Ana");

        System.out.println(set);
        System.out.println(set.size());

        //2. Crie um HashSet de cores usando addAll. Depois use contains dentro de um if para avisar se a cor "verde" já está no conjunto ou não.

        HashSet<String> cores = new HashSet<>();

        cores.addAll(List.of("Amarelo", "Azul", "Vermelho", "Rosa"));

        if (cores.contains("Verde")){
            System.out.println("A cor verde está no conjunto");
        } else {
            System.out.println("A cor verde não está no conjunto");
        }

        //3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para tirar os repetidos. Imprima os dois e compare.
        ArrayList<String> lista = new ArrayList<>(List.of("Marina", "Ana Luiza", "Laura" , "Marina", "Julia", "Laura"));

        System.out.println(lista);

        HashSet<String> conjunto = new HashSet<>(lista);

        System.out.println(conjunto);


        //4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e imprima de novo, junto com o tamanho.
        HashSet<String> cpfs = new HashSet<>(List.of("122.448.579-99", "245.321.123-00", "345.567.890-12"));

        System.out.println(cpfs);
        cpfs.remove("122.448.579-99");
        System.out.println(cpfs);
        System.out.println(cpfs.size());

        //5. Crie um HashSet com três frutas e percorra ele com for imprimindo uma por linha.
         HashSet<String> frutas = new HashSet<>();

         frutas.add("Banana");
         frutas.add("Morango");
         frutas.add("Mirtilo");

         for (String fruta : frutas){
             System.out.println(fruta);
         }

        //6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e imprima o isEmpty() de novo.
        HashSet<Integer> numero = new HashSet<>();

        System.out.println(numero.isEmpty());
        numero.add(32);
        System.out.println(numero.isEmpty());

    }
}
