package org.example.elastech.fundamentos.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioHashMap {
    public static void main(String[] args) {

        //1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa inteiro e depois use get para mostrar a idade de uma delas.
        HashMap<String, Integer> idades = new HashMap<>();

        idades.put("Eduardo",27);
        idades.put("Ian", 19);
        idades.put("Gael", 20);
        System.out.println(idades);
        System.out.println(" A idade de Ian é: " + idades.get("Ian"));

        /*2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
        imprima, e depois faça put de "café" DE NOVO com valor 7.50.
        Imprima outra vez e veja o que aconteceu com o tamanho.
        */
        HashMap<String, Double> precoProdutos = new HashMap<>();

        precoProdutos.put("Café", 5.00);
        System.out.println(precoProdutos);
        precoProdutos.put("Café", 7.50);
        System.out.println(precoProdutos.size());
        System.out.println(precoProdutos);

        /*3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
        dentro de um if para mostrar o telefone de alguém que está na agenda
        e de alguém que não está.
        */
        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Anne", "(11) 99988-5544");
        agenda.put("Elisa", "(21) 98877-6655");

        if (agenda.containsKey("Elisa")){
            System.out.println(agenda.get("Elisa"));
        }else {
            System.out.println("Essa pessoa não está na agenda.");
        }

        if (agenda.containsKey("Mariana")) {
            System.out.println(agenda.get("Mariana"));
        } else {
            System.out.println("Essa pessoa não está na agenda.");
        }

        /*4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
   Use getOrDefault para mostrar a quantidade de um produto que existe
   e de um que não existe (devolvendo 0). Depois tente com get normal
   no que não existe e compare.
         */
        HashMap<String, Integer> estoque = new HashMap<>(Map.of("Teclado", 55, "Mouse", 25));

        System.out.println(estoque.getOrDefault("Teclado", 0));
        System.out.println(estoque.getOrDefault("Tablet", 0)); // Se não encontrar, você define o valor que quer receber.
        System.out.println(estoque.get("Tablet")); // Se não encontrar, retorna null.

        //5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho. Remova uma delas e imprima de novo.
        HashMap<String, Double> notasAlunas = new HashMap<>();

        notasAlunas.put("Angélica" , 7.5);
        notasAlunas.put("Beatriz", 8.0);
        notasAlunas.put("Fernanda", 6.8);

        System.out.println(notasAlunas);
        System.out.println(notasAlunas.size());

        notasAlunas.remove("Fernanda");
        System.out.println(notasAlunas);
        System.out.println(notasAlunas.size());


        //Exemplo
        HashMap<String, String> mapa = new  HashMap<>(Map.of("Maria", "maria@gmail.com", "Ana", "ana@gmail.com"));

        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        System.out.println(mapa.getOrDefault(nome, "Nome não encontrado."));
    }
}
