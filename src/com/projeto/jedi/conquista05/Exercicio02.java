package com.projeto.jedi.conquista05;

/**
 * Criar um array de tipo inteiro de 100 posições que vai receber valores de 0 a 100
 * . Inicializar esse valores usando
 * um laço de Repetição.
 * E utilizando o foreach, printar todos os valores multiplicando por 2.
 */
public class Exercicio02 {
    public static void main(String[] args) {
        //TODO Vou nem olhar!
        int[] meuArray1 = {1, 2, 3, 4, 5};
        int multi = 0;
        for (int num : meuArray1) {
            multi = num * 2;
        }
        System.out.println(multi);
    }
}
