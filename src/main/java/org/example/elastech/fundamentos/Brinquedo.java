package org.example.elastech.fundamentos;

public class Brinquedo {
    //Criem duas classes, uma chamada Main e outra chamada Brinquedos. Crie um método dentro da classe Brinquedos chamado verBrinquedo, e faça ele receber uma instância da classe Brinquedo e printar qual instância foi.
    //
    //Exemplo
    //
    //"O brinquedo escolhido foi:
    public String nome;

    public void verBrinquedo(Brinquedo brinquedo){
        System.out.println("O brinquedo escolhido foi: " + brinquedo.nome);
    }

    public int soma( int n1, int n2){
        return n1 + n2;
    }

    public Brinquedo(){

    }
}
