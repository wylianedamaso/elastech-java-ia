package org.example.elastech.fundamentos.poo.heranca;

public class Aluna extends Pessoa {
    public String curso;

    public void estudar(){
        System.out.println(nome + " está estudando " + curso + "."
        );
    }
}
