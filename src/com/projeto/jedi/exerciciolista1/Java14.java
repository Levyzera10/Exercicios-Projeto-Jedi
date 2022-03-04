package com.projeto.jedi.exerciciolista1;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
 * 100, quantos estão entre 101 e 200 e quantos são maiores de 200.
 */
public class Java14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeNum1 = 0;
        int quantidadeDeNum2 = 0;
        int quantidadeDeNum3 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um número");
            int numeroDigitado = scanner.nextInt();
            if (numeroDigitado > 0 && numeroDigitado < 100) {
                quantidadeDeNum1 += 1;
            }
            else if (numeroDigitado > 101 && numeroDigitado < 200) {
                quantidadeDeNum2 += 1;
            }
            else if (numeroDigitado > 200){
                quantidadeDeNum3 +=1;
            }
        }
        System.out.println("A quantidade de números que estão entre 0 e 100 é  :" + quantidadeDeNum1);
        System.out.println("A quantidade de números que estão entre 101 e 200 é  :" + quantidadeDeNum2);
        System.out.println("A quantidade de números que são maiores que  200 é  :" + quantidadeDeNum3);
    }
}
