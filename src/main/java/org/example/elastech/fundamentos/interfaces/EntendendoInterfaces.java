package org.example.elastech.fundamentos.interfaces;

import java.util.ArrayList;

public class EntendendoInterfaces { /*
1. Crie uma interface Animal com o método emitirSom().
   Crie a classe Cachorro que implementa ela e imprime "Au au!".
   Na Main, crie um cachorro e chame o método. Não esqueça do @Override.

2. Agora acrescente a classe Gato, que implementa a mesma interface e
   imprime "Miau!". Na main, declare as duas variáveis como Animal:

   Animal bidu = new Cachorro();
   Animal salem= new Gato();

   Chame emitirSom() nas duas.

3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
   e percorra com for-each chamando emitirSom(). Repare que não
   tem nenhum if. Dica:

animais.add(new Cachorro());


4. Crie uma interface Notificacao com o método enviar(String mensagem).
   Crie duas classes que implementam ela: Email e SMS. Cada uma
   imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
   e percorra com for-each, enviando a mesma mensagem.

   Saída esperada:
   E-mail enviado: Sua compra foi aprovada!
   SMS enviado: Sua compra foi aprovada!

5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
   Crie Carro e Moto implementando os dois. Coloque numa lista e
   percorra com for-each chamando os dois métodos em cada um.
*/
    public static void main(String[] args) {
        //Exercício 1
        Cachorro cachorro = new Cachorro();

        cachorro.emitirSom();

        //Exercício 2
        Animais caramelo = new Cachorro();
        Animais mel = new Gato();

        caramelo.emitirSom();
        mel.emitirSom();

        //Exercício 3
        ArrayList<Animais> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animais animal : animais){
            animal.emitirSom();
        }

        //Exercício 4
        ArrayList<Notificacao> mensagens = new ArrayList<>();
        mensagens.add(new Email());
        mensagens.add(new SMS());

        for (Notificacao mensagem : mensagens){
            mensagem.enviar("Sua compra foi aprovada!");
        }

        //Exercício 5
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo veiculo : veiculos){
            veiculo.ligar();
            veiculo.acelerar();

        }
    }
}
