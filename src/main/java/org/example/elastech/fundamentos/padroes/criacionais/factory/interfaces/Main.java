package org.example.elastech.fundamentos.padroes.criacionais.factory.interfaces;

import org.example.elastech.fundamentos.padroes.criacionais.factory.BancoDeDadosFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o banco que deseja utilizar? Digite: \n 1 - MySQL \n 2 - Oracle");
        int opcao = scanner.nextInt();

        BancoDeDados banco = BancoDeDadosFactory.criar(opcao);


        Oracle oracle = new Oracle();
        MySql mySql = new MySql();

        BancoDeDados bancoDeDados = new Oracle();

        System.out.println(bancoDeDados.getNumero());

        conectarBanco(mySql);
        conectarBanco(oracle);
    }

    public static void conectarBanco(BancoDeDados banco){
        System.out.println(banco.chamarBanco() + " (ID/Número: " + banco.getNumero() + ")");    }
}
