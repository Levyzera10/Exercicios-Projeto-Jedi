package com.projeto.jedi.exerciciolista1;

import java.util.Scanner;

/**
 * ) Leia a idade de 20 pessoas e exiba a média das idades
 */
public class Java07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idade = new int[20];
        int soma = 0;
        System.out.println("Digite idade de 20 pessoas" );
        for (int i = 0; i <= 19; i++) {
            idade[i] = scanner.nextInt();
            soma += idade[i];
            System.out.println(soma);
        }
        System.out.println("A soma das idades :" + soma);
        System.out.println("média das idades :" + soma/20);
    }
}
