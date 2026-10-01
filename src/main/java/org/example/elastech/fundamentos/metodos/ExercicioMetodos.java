package org.example.elastech.fundamentos.metodos;

import java.util.Scanner;

public class ExercicioMetodos {
    /*1 — Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!".
     Chame ele no main.
O método vai fora do main, mas dentro da classe, no mesmo nível do main, logo abaixo dele. Se você tentar criar um
     método dentro do main, não compila.
Nos próximos, crie uma classe separada para guardar os métodos (pode ser uma só, chamada Utilidades, ou uma por
 exercício, você decide). Lembre que para chamar, você precisa escrever o nome da classe na frente: Utilidades.dobro(5).
2 — Crie um método saudar(String nome) que imprime "Olá, [nome]! Tudo bem?".
               Chame ele três vezes, passando nomes diferentes.
3 — Crie um método dobro(int numero) que devolve o dobro do número recebido. No main, chame ele e mostre o resultado.
4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas. No main,
               peça as duas notas com Scanner e mostre a média com duas casas decimais.
5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e
               use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.
6 — Crie três métodos com o mesmo nome somar:
um que recebe dois inteiros
um que recebe três inteiros
um que recebe dois decimais
No main, chame os três e veja o Java escolher sozinho qual usar.
7 — Crie dois métodos chamados saudacao:
um sem parâmetro, que imprime "Olá!"
um que recebe um nome, e imprime "Olá, [nome]!"
     */
    public static void main(String[] args) {
       //Exercício 01
        mostrarBoasVindas();

        Scanner scanner = new Scanner(System.in);

        //Exercício 02
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        Utilidades.saudar(nome);
        System.out.println("Digite seu nome");
        nome = scanner.nextLine();
        Utilidades.saudar(nome);
        System.out.println("Digite seu nome");
        nome = scanner.nextLine();
        Utilidades.saudar(nome);

        //Exercício 03
        System.out.println("Dobro: " + Utilidades.dobro(7));

        //Exercício 04
        System.out.println("Digite a primeira nota");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota");
        double n2 = scanner.nextDouble();
        double media = Utilidades.calcularMedia(n1,n2);
        System.out.printf("A média das notas é %.2f%n", media);

        //Exercício 05
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (Utilidades.ehMaiorDeIdade(idade)) {
            System.out.println("Você é maior de idade.");
        }else {
            System.out.println("Você é menor de idade." );
        }


        //Exercício 06
        System.out.println(Utilidades.somar(2.5, 22));

        System.out.println(Utilidades.somar(25,35));

        System.out.println(Utilidades.somar(30, 50, 25));

        //Exercício 07
        Utilidades.saudacao();

        Utilidades.saudacao("Wyliane");

    }
     static void mostrarBoasVindas(){
         System.out.println("Bem-vinda ao curso de Java!");
     }
}
