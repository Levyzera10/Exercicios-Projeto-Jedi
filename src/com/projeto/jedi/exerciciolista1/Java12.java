package com.projeto.jedi.exerciciolista1;

import java.util.Scanner;

/**
 * ) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
 * pares
 */
public class Java12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeNum = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um número");
            int numeroDigitado = scanner.nextInt();
            if (numeroDigitado % 2 == 0) {
                quantidadeDeNum += 1;
            }
        }
        System.out.println("A quantidade de números pares é :" + quantidadeDeNum);
    }
}
