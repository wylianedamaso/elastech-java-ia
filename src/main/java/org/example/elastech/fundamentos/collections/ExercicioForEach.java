package org.example.elastech.fundamentos.collections;

import java.util.ArrayList;
import java.util.List;

public class ExercicioForEach {
    /*
    1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
   um por linha.

2. Crie um ArrayList com 5 notas e imprima todas usando for-each.

3. Com o array de notas {8, 6, 10, 7}, use for-each para somar
   todas e mostrar a soma e a média.

4. Com um array de nomes, use for-each e um if para contar quantos
   têm mais de 5 letras. Mostre o total. Dica: usem o método length.

5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
   usando o índice. Deixe os dois na mesma classe e compare.


  Referência:
For-each:
for (tipo apelido : coleção) {

 }
Array normal:
String[] nomeDoArray = {"Ana", "Maria"};

ArrayList:
ArrayList<String> lista = new ArrayList<>();
     */
    public static void main(String[] args) {

        String[] nomes = {"Fátima", "Juliana", "Cália", "Sara"};

        for (String nome : nomes){
            System.out.println(nome);
        }


        ArrayList<Double> notas = new ArrayList<>(List.of(8.5, 7.0, 6.9, 8.0, 9.4));

        for (Double nota : notas){
            System.out.println(nota);
        }


        int[] outrasNotas = {8, 6, 10, 7};
        int soma = 0;

        for (int outraNota : outrasNotas){
           soma = soma + outraNota;

        }

        double media = (double) soma / outrasNotas.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        String[] outrosNomes = {"Samuel", "Saulo", "Davi", "João", "Anderson" };

        for ()
    }
}
