package org.example.elastech.fundamentos.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSimplesTest {
    private CalculadoraSimples calculadora;

    //@BeforeEach -> Antes de cada teste rode esse código primeiro
    @BeforeEach
    void criarObjeto() {
        calculadora = new CalculadoraSimples();
    }

    //@Test -> Diz que é um teste
    @Test
    void doisMaisDoisDeveSerQuatro() {
        assertEquals(4, calculadora.soma(2, 2));

    }

    @Test
    void tresMaisQuatroDeveSerSete() {
        assertEquals(7, calculadora.soma(3, 4));
    }

    @Test
    void deveLancarErroAoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}