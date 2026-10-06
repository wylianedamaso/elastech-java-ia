package org.example.elastech.fundamentos.revisao;

public class RevisaoOperadores {
    public static void main(String[] args) {
        //Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto.
        int a = 15, b = 4;

        System.out.println("Soma: " + (a + b) + " , Subtração: " + (a - b) + " , Multiplicação: " + (a * b) + " , Divisão: " + (a / b) + ", Resto: " + (a % b));

        //Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.

        int saldo = 1000;
        saldo += 250;
        saldo -= 380;

        System.out.println(saldo);

        //Crie a = 10 e b = 10. Imprima o resultado de a == b, a!=b, a > b e a >=b.

        int variavelA = 10, variavelB = 10;
        System.out.println(variavelA == variavelB);
        System.out.println(variavelA != variavelB);
        System.out.println(variavelA > variavelB);
        System.out.println(variavelA >= variavelB);

        //Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.

        int idade = 20;
        boolean temCarteira = true;

        System.out.println(idade >= 18 && temCarteira);

        //Crie um número e imprima o resto da divisão dele por 2.

        int numero = 9;

        System.out.println( numero % 2);

        //Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.

        double pacoteArroz = 5.50;
        double total = 3 * pacoteArroz;

        System.out.printf("O total da compra é de R$%.2f.%n", total);

        /* Mini-desafio —
         Crie uma variável com um número qualquer e, sem usar if, imprima true ou false para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo?
         Uma comparação já produz true ou false sozinha — não precisa de if pra isso. E um número é divisível por outro quando o resto da divisão é zero.
         */

        int num = 18;

        System.out.println(num % 3 == 0 && num % 5 ==0);
    }
}
