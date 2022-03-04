package com.projeto.jedi.exerciciolista1;

import java.util.Scanner;

/**
 * ) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
 * números
 */
public class Java05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idade = new int[10];
        int soma = 0;
        System.out.println("Digite idade de 10 pessoas" );
        for (int i = 0; i <= 9; i++) {
            idade[i] = scanner.nextInt();
            soma += idade[i];
            System.out.println(soma);
        }
        System.out.println("A soma das idades :" + soma);
    }
}
