package org.example.elastech.fundamentos.lambda.stream;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1 - Filtrar números pares
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Números pares: " + resultado);


        // 2 - Transformar frutas em maiúsculas
        List<String> frutas = List.of(
                "manga", "pêssego", "mirtilo", "abacaxi"
        );

        frutas.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        // 3 - Filtrar e contar cidades
        List<String> cidades = List.of(
                "São Paulo", "Rio de Janeiro",
                "Salvador", "Curitiba", "Santos"
        );

        long quantidade = cidades.stream()
                .filter(cidade -> cidade.startsWith("S"))
                .count();

        System.out.println(
                "Quantidade de cidades que começam com S: " + quantidade
        );
    }

    }

