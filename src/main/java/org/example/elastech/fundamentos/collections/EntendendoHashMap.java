package org.example.elastech.fundamentos.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class EntendendoHashMap {
    /*.put("Ana", 28); adiciona uma chave + valor.
        .get("Ana"); localiza/busca o valor associado à chave.
        .getOrDefault("Zoe", "Não encontrado"); retorna o valor padrão, quando a chave não existe.
        .containsKey("Ana"); Verifica se tem a chave
        .containsValue(28); Verifica se tem o valor
        .remove("Ana"); remove
        .size(); Mostra o tamanho
        .isEmpty(); Verifica se está vazio
        .keySet(); Mostra todas as chaves
        .values(); Mostra todos os valores
        putAll(Map.of())
        */
    public static void main(String[] args) {
        HashMap<String, String> emails = new HashMap<>();

        emails.put("Ane", "ane@gmail.com");
        emails.put("Paloma", "paloma@gmail.com");

        System.out.println(emails.get("Ane"));
        System.out.println(emails.get("Paloma"));
        System.out.println(emails.get("Olá"));

        System.out.println(emails.getOrDefault("Olá", "Chave não encontrada"));
        // Sem getOrDefault(), get() retornaria null se a chave não existisse.
        // Com getOrDefault(), retorna o valor padrão informado.

        System.out.println(emails.keySet());
        System.out.println(emails.values());

        System.out.println(emails.containsKey("Ane"));
        emails.remove("Ane");
        System.out.println(emails);

        System.out.println(emails.containsValue("ane@gmail.com"));
        System.out.println(emails.size());
        System.out.println(emails.isEmpty());

        emails.putAll(Map.of(
                "Bianca", "bianca@gmail.com",
                "Helena", "helena@gmail.com"));

        System.out.println(emails);
        System.out.println(emails.put("Ane", "novo@gmail.com"));

        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        HashMap<String, ArrayList<String>> email = new HashMap<>();
        email.put("Rosa", lista);
        lista.add("Senha do banco");
        email.put("Rosalia", lista2);

        System.out.println(email.containsKey("Jessica"));
        System.out.println(email);



    }
}
