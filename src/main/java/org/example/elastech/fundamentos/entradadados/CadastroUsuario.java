package org.example.elastech.fundamentos.entradadados;

import java.util.Scanner;

public class CadastroUsuario {
    /*
    6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:

Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).

Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).

Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeCompleto;
        int anoDeNascimento;

        System.out.println("Digite seu ano de nascimento: ");
        anoDeNascimento = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite seu nome completo: ");
        nomeCompleto = scanner.nextLine();

        System.out.println("O usuário " + nomeCompleto + " nasceu em " + anoDeNascimento + ".");

    }
}
