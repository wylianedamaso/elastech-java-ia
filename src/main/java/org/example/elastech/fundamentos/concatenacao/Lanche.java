package org.example.elastech.fundamentos.concatenacao;

import java.util.Scanner;

public class Lanche {
    /*
    1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String lanche;
        double valorDoLanche;

        System.out.println("Digite o nome do lanche que gostaria de pedir:");
        lanche = scanner.nextLine();
        System.out.println("Digite o valor do lanche: R$");
        valorDoLanche = scanner.nextDouble();

        if (valorDoLanche > 30.00){
            System.out.printf("O lanche %s com desconto custará R$ %.2f.%n" , lanche, (valorDoLanche -5));
        }else {
            System.out.printf("O lanche %s custará R$ %.2f.%n" , lanche, valorDoLanche);

        }

        scanner.close();


    }
}
