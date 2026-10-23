package org.example.elastech.fundamentos.padroes.criacionais.factory.interfaces;

public interface BancoDeDados {
    /*Crie uma interface BancoDeDados que implementa chamarBanco() e getNumero(). Depois classes chamadas Oracle e MySql e Main. MySql e Oracle devem implementar a interface e ter um atributo int numero. chamarBanco() deve retornar uma mensagem de acordo com o banco conectado, e getNumero deve retornar o numero.
    Exemplo: O Banco conectado é o MySql.
    Na sua Main crie um método conectarBanco() para receber um dos bancos e dentro dele chamar o método chamarBanco() .
     */
    int getNumero();
    String chamarBanco();
}
