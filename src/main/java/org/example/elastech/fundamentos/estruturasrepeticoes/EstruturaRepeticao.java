package org.example.elastech.fundamentos.estruturasrepeticoes;

import java.util.Scanner;

public class EstruturaRepeticao {

    public static void main(String[] args) {


//        for (int i = 0; i <=5 ; i++){
//            System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);

        int senha = 0;

        System.out.println("Digite sua senha:");
        scanner.nextInt();

        while (senha != 1234){
            System.out.println("Senha incorreta, digite novamente");
            senha = scanner.nextInt();

        }System.out.println("Acesso liberado!");



//        do {
//            System.out.println("Digite a sua senha: ");
//            senha = scanner.nextInt();
//        }while (senha != 1234);

    }
}
