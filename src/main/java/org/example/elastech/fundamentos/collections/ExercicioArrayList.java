package org.example.elastech.fundamentos.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioArrayList {
    /*- 1)Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

- 2)Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.

- 3)Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.

- 4)Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.

- 5)Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)
- 6)Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.


Referência:

nomes.add("Carla");          // adiciona no fim
nomes.get(0);                // pega pela posição
nomes.size();                // quantos tem
nomes.set(0, "Zoe");         // troca o valor da posição
nomes.remove(1);             // remove pela posição
nomes.contains("Ana");       // true ou false
nomes.indexOf("Bia");        // em que posição está
nomes.isEmpty();             // true se está vazia
     */
    public static void main(String[] args) {


        // Exercício 1
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Eloise");
        nomes.add("Franchesca");
        nomes.add("Bruna");

        System.out.println(nomes);

        // Exercício 2
        ArrayList<String> frutas = new ArrayList<>(List.of("Banana", "Morango", "Uva", "Mirtilo"));
        System.out.println(frutas.get(0));
        System.out.println(frutas.get(3));
        System.out.println(frutas.size());

        // Exercício 3
        ArrayList<String> nome = new ArrayList<>(List.of("Zoe", "Fernanda", "Anabelle", "Joana"));
        System.out.println(nome);
        nome.set(1, "Bella");
        System.out.println(nome);

        // Exercício 4
        ArrayList<String> cidades = new ArrayList<>(List.of("São Paulo","Piracicaba", "São Bernado", "Moema"));
        System.out.println(cidades);
        cidades.remove(1);
        System.out.println(cidades.size());

        // Exercício 5
        ArrayList<String> novoNome = new ArrayList<>(List.of("Ana", "Bianca", "Helena", "Ivyh", "Samantha", "Juliana"));
        for (int i = 0; i < novoNome.size(); i ++){
            System.out.println(i + ": " + novoNome.get(i));

        }

        // Exercício 6
        ArrayList<String> nomeBusca = new ArrayList<>(List.of( "Bianca", "Hellen", "Hyngrid", "Débora", "Jussara"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nomeDigitado = scanner.nextLine();

        if (nomeBusca.contains(nomeDigitado)) {
            System.out.println("O nome: " + nomeDigitado + " está na posição: " + nomeBusca.indexOf(nomeDigitado));
        } else {
            System.out.println("O nome: " + nomeDigitado + " não está na lista.");
        }

    }
}
