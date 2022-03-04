package com.projeto.jedi.exerciciolista1;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
 * 100
 */
public class Java13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeNum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um número");
            int numeroDigitado = scanner.nextInt();
            if (numeroDigitado > 0 && numeroDigitado < 100) {
                quantidadeDeNum += 1;
            }
        }
        System.out.println("A quantidade de números que estão entre 0 e 100 é  :" + quantidadeDeNum);
    }
}
