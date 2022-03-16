package com.projeto.jedi.conquista04;

import java.util.Scanner;

/**
 * Criar um código que inicializa um array com 5 valores e também um segundo array que vai receber os mesmo valores do
 * primeiro utilizando atribuição. B[0] = A[0]. Deve se usar um laço de Repetição e não atribuir de forma direta
 * os valores.
 */
public class Exercicio01 {
    public static void main(String[] args) {
        int[] meuArray1 = {1, 2, 3, 4, 5};
        int[] meuArray2 = new int[5];
        for (int i = 0;i < meuArray1.length;i++){
            meuArray2[i] = meuArray1[i];
        }
    }
}
