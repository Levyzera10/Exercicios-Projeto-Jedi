package com.projeto.jedi.conquista02;

/**
 * Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor
 * qualquer, sendo atendida na segunda condição, não executando a terceira e nem um ELSE
 */

public class Exercicio04 {
    public static void main(String[] args) {

        boolean verificacao = true;
        int idade = 30;

        if (idade == 20) {
            System.out.println("true");
        } else if (idade == 30) {
            System.out.println("true");
        } else if (idade == 19) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
