package org.example.elastech.fundamentos.padroes.criacionais.factory;

import org.example.elastech.fundamentos.padroes.criacionais.factory.interfaces.BancoDeDados;
import org.example.elastech.fundamentos.padroes.criacionais.factory.interfaces.MySql;
import org.example.elastech.fundamentos.padroes.criacionais.factory.interfaces.Oracle;

public class BancoDeDadosFactory {
    public static BancoDeDados criar(int opcao){
        if (opcao == 1){
            return new MySql();
        } else if (opcao == 2){
            return new Oracle();
        }else {
            //padrão usar o throw e tratar como exceção
            throw new IllegalArgumentException("Opção inválida!");
        }
    }
}
