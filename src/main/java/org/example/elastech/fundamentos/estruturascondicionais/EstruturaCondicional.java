package org.example.elastech.fundamentos.estruturascondicionais;

public class EstruturaCondicional {
    public static void main(String[] args) {
        //1 — Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança", de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".
        int idade = 0;

        if (idade < 13){
            System.out.println("Criança");
        }else if (idade >=13 && idade <=17 ){
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59 ) {
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }

        //2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.

        double saldoDaConta = 500.00;
        double valorDaCompra = 320.00;

        if (valorDaCompra <= saldoDaConta){
            System.out.println("Compra aprovada! Seu saldo atual é R$" + (saldoDaConta - valorDaCompra) + ".");
        }else{
            System.out.println("Saldo insuficiente, está faltando R$" + (valorDaCompra - saldoDaConta));
        }

        //3 — Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá. Qualquer outro número mostra "Opção inválida".
        int opcao = 4;

        switch (opcao){
            case 1:
                System.out.println("Café");
                break;

            case 2:
                System.out.println("Cappuccino");
                break;

            case 3:
                System.out.println("Chocolate quente");
                break;

            case 4:
                System.out.println("Chá");
                break;

            default:
                System.out.println("Opção inválida");
        }

        //4 — Crie variáveis idade (17) e temAutorizacao (true). Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização. Faça o mesmo para precisar ter 18 anos e ter autorização.
        int idades = 17;
        boolean temAutorizacao = true;

        if (idades >= 18 || temAutorizacao){
            System.out.println("Pode entrar na festa");
        } else {
            System.out.println("Não pode entrar na festa");
        }

        if (idades >= 18 && temAutorizacao){
            System.out.println("Pode entrar na festa");
        } else {
            System.out.println("Não pode entrar na festa");
        }




        /*Desafio: Crie variáveis para três notas de uma aluna. Calcule a média e mostre: "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5. Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.

        Ps: Utilize double para o valor das notas. Para controlar as casas decimais, use printf com o marcador %.2f onde você quer que apareça a média no seu texto (Troquem ele de lugar pra ver o que acontece), onde 2 é a quantidade de casas que você quer (Experimentem trocar por 3 e ver o que acontece). O texto e a pontuação vão dentro das aspas, e o \n no final pula a linha (ele funciona como um enter para que tudo não fique colado um do lado do outro):

        System.out.printf("Sua média é: %.2f\n", media);
        */
        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média é: %.2f\n", media);

        if (media >= 7){
            System.out.println("Aprovada");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovada");
        }

        System.out.printf("Sua primeira nota foi %.2f , sua segunda nota foi %.2f , sua terceira nota foi %.2f então a sua média é %.2f .\n ", nota1, nota2, nota3, media);

    }
}

