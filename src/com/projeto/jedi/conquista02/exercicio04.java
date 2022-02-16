package com.projeto.jedi.conquista02;

/**
 * Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor qualquer, sendo atendida na
 * segunda condição, não executando a terceira e nem um ELSE
 */

public class exercicio04 {
    public static void main(String[] args) {

        boolean verificacao = true;
        int idade = 19;

        if (idade == 20) {
            System.out.println("true");
        }
        if (idade == 19) {
            System.out.println(true);
        } else {
            System.out.println("false");
        }
    }
}
