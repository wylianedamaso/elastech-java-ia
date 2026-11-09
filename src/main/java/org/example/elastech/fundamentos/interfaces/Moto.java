package org.example.elastech.fundamentos.interfaces;

public class Moto implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("A moto ligou e está pronta para sair!");
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando!");
    }
}
