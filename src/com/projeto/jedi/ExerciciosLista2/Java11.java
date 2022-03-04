package com.projeto.jedi.ExerciciosLista2;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
 * maiores do que 8.
 */
public class Java11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeNum = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um número ");
            int numeroDigitado = scanner.nextInt();
            if (numeroDigitado > 8) {
                quantidadeDeNum += 1;
            }
        }
        System.out.println("A quantidade de números maiores que 8 são :" + quantidadeDeNum);
    }
}
