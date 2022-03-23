package com.projeto.jedi.conquista04;

import java.util.Arrays;

/**
 * Criar dois arrays de tipo inteiro de tamanho 10 e inicializar os dois com valores diferentes. Criar também um
 * segundo array de 10 posições que vai receber como valor para cada posição a subtração do array A pelo array B.
 * C = A - B
 */
public class Exercicio03 {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayB = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] arrayC = new int[10];
        for (int i = 0; i < arrayA.length;i++){
            arrayC[i] = arrayA[i] - arrayB[i];
        }
    }
}
