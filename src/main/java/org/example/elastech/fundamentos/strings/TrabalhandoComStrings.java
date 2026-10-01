package org.example.elastech.fundamentos.strings;

import java.util.Locale;
import java.util.Scanner;

public class TrabalhandoComStrings {
    /*1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).
2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.
3 — Peça o nome da pessoa e mostre a primeira letra dele.
4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.

Digite uma frase: Estou aprendendo Java
Digite uma palavra: Java
A palavra aparece na frase? true

5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
Digite seu nome: Ana
Digite de novo: ANA
Os nomes são iguais? true

Referência:
String nome = "Maria Silva";
nome.length();                 // 11
nome.toUpperCase();            // MARIA SILVA
nome.toLowerCase();            // maria silva
nome.contains("Silva");        // true
nome.charAt(0);                // M
nome.substring(0, 5);          // Maria
nome.replace("Silva","Souza"); // Maria Souza
"  oi ".trim();               // "oi"
nome.equals("maria silva");           // false
nome.equalsIgnoreCase("maria silva"); // true
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        String frase;
        String palavra;

        System.out.println("Digite seu nome completo:");
        nome = scanner.nextLine();
        System.out.println("Seu nome tem " + nome.length() + " Caracteres.");
        System.out.println(nome.toUpperCase(Locale.ROOT));
        System.out.println(nome.toLowerCase(Locale.ROOT));
        System.out.println(nome.charAt(0));

        System.out.println("Digite uma frase:");
        frase = scanner.nextLine();
        System.out.println("Digite agora uma palavra:");
        palavra = scanner.nextLine();
        System.out.println("Sua frase contem a palavra que digitou? " + frase.contains(palavra));

        System.out.println("Digite seu nome com letras minusculas:");
        String nome1 = scanner.nextLine();
        System.out.println("Digite seu nome novamente com letras maiúsculas:");
        String nome2 = scanner.nextLine();
        System.out.println("Os nomes são iguais? " + nome1.equalsIgnoreCase(nome2));

    }
}
