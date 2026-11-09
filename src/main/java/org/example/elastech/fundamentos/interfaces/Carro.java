package org.example.elastech.fundamentos.interfaces;

public class Carro implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("O carro ligou e está pronto para sair!");
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }
}
