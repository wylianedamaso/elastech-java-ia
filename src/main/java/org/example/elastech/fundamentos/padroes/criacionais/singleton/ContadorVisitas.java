package org.example.elastech.fundamentos.padroes.criacionais.singleton;

public class ContadorVisitas {
    // 1. Atributo estático para guardar a única instância
    private static ContadorVisitas instancia;
    private int total = 0;

    // 2. Construtor privado tranca o new de fora da classe
    private ContadorVisitas(){

    }

    // 3. Método público estático para obter a instância única
    public static ContadorVisitas getInstancia(){
        if (instancia == null){
            instancia = new ContadorVisitas();
        }
            return instancia;
    }

    public void registrarVisita(){
        this.total++;
    }

    public int getTotal(){
        return this.total;
    }

}
