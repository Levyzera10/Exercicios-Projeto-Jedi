package com.projeto.jedi.conquista04;

import java.util.Scanner;

/**
 * Criar um array de 10 posições de tipo inteiro que vai receber 10 valores. Criar também um segundo array de tipo
 * String que vai receber o valor do primeiro multiplicado por 5 com a seguinte descrição: "O valor multiplicado por 5 é: "
 */
public class Exercicio02 {
    public static void main(String[] args) {

        int[] meuArray1 = new int[10];
        String[] meuArray2 = new String[10];
        for (int i = 0; i < meuArray1.length; i++) {
            meuArray2[i] = "O valor multiplicado por 5 : " + (meuArray1[i] * 5);
        }
    }
}


