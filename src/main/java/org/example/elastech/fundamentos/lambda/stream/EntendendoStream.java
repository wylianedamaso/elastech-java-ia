package org.example.elastech.fundamentos.lambda.parte5.stream;

import java.util.List;

public class EntendendoStream {

    List<Integer> numeros = List.of(1,2,3,4,5,6);

    List<Integer> resultado = numeros.stream()
            .filter(n -> n %2 == 0)
            .map(n -> n* 10)
            .toList();
}
