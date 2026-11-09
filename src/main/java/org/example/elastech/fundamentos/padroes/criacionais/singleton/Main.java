package org.example.elastech.fundamentos.padroes.criacionais.singleton;

public class Main {
    public static void main(String[] args) {

// Tentativa de instanciar diretamente com 'new' geraria um erro de compilação:
    // ConfiguracaoSistema configErro = new ConfiguracaoSistema(); // ERRO! Construtor é privado.

    // A forma correta de obter a instância:
    ConfiguracaoSistema config1 = ConfiguracaoSistema.getInstance();
    ConfiguracaoSistema config2 = ConfiguracaoSistema.getInstance();

    // Testando se ambas as variáveis apontam exatamente para o mesmo objeto na memória
     if (config1 == config2) {
        System.out.println("Sucesso! Ambas as variáveis são a mesma instância (Singleton funcionando).");
    } else {
        System.out.println("Ops! Foram criadas instâncias diferentes.");
    }

    //A mensagem "Configuração inicializada!" do construtor só vai aparecer UMA ÚNICA VEZ no console, na primeira vez que getInstance() é chamado.

    }
}
