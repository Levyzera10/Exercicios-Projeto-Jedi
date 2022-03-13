package com.projeto.jedi.conquista03;

/**
 * Criar um código que declara uma variável numérica de valor 0, e que utilizando o DO WHILE, adicionar valor a essa
 * variável maior que 10. Essa variável deve ser utilizada numa comparação no DO WHILE e o código NÃO DEVE REPETIR a
 * execução do DO WHILE.
 */
public class Exercicio03 {
    public static void main(String[] args) {

        int num = 0;
        do {
            System.out.println(num);
            num+=10;
        }while (num < 10);
    }
}
