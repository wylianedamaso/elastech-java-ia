package org.example.elastech.fundamentos.collections;

import java.util.ArrayDeque;
import java.util.List;

public class ExercicioArrayDeque {

    public static void main(String[] args) {

        //  1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila e quantas pessoas tem.
        ArrayDeque<String> pessoa = new ArrayDeque<>();

        pessoa.add("Joana");
        pessoa.add("Rose");
        pessoa.add("Yasmim");

        System.out.println(pessoa);
        System.out.println(pessoa.size());


        //2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e imprima a fila logo depois. Repare que ela não mudou.

        ArrayDeque<String> pessoas = new ArrayDeque<>();

        pessoas.addAll(List.of("Ana","Sofia", "Carolina"));
        System.out.println(pessoas.peek());
        System.out.println(pessoas);

        //3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila depois. Compare com o exercício 2.
        pessoas.poll();
        System.out.println(pessoas);

        //4. Crie uma fila com três nomes e atenda todos usando while (!fila.isEmpty()). No final, imprima "Fila vazia!".
        ArrayDeque<String> nomes = new ArrayDeque<>(List.of("Igor", "João", "Flavio"));

        while (!nomes.isEmpty()){
            nomes.poll();
        }
        System.out.println("Fila vazia!");

        //5. Crie uma fila com três nomes e use contains para responder duas perguntas: se "Bia" está na fila e se "Zoe" está.

        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.add("Zoe");
        fila.add("Sabrina");
        fila.add("Célia");

        System.out.println(fila.contains("Bia"));
        System.out.println(fila.contains("Zoe"));

           /*6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
   - se estiver vazia  -> "Não tem ninguém na fila."
   - se tiver gente    -> "Próximo: [nome]"
   Depois adicione uma pessoa e teste de novo.
     */

        ArrayDeque<String> nome = new ArrayDeque<>();
        if (nome.isEmpty()){
            System.out.println("Não tem ninguém na fila.");
        }else {
            System.out.println("Proximo: " + nome.peek());
        }

        nome.add("Jane");

        if (nome.isEmpty()){
            System.out.println("Não tem ninguém na fila.");
        }else {
            System.out.println("Proximo: " + nome.peek());
        }
    }

}
