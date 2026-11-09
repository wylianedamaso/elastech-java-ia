package org.example.elastech.fundamentos.padroes.criacionais.singleton;

    public class ConfiguracaoSistema {
        // 1. Instância estática privada
        private static ConfiguracaoSistema instancia;

        // 2. Construtor privado (impede o uso de new fora daqui)
        private ConfiguracaoSistema() {
            System.out.println("Configuração inicializada!");
        }

        // 3. Ponto de acesso global
        public static ConfiguracaoSistema getInstance() {
            if (instancia == null) {
                instancia = new ConfiguracaoSistema();
            }
            return instancia;
        }
    }
