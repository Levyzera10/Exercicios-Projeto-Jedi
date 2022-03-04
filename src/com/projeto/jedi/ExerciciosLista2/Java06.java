package com.projeto.jedi.ExerciciosLista2;

import java.util.Scanner;

/**
 * Leia a idade de 20 pessoas e exiba a soma das idades.
 */
public class Java06 {
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
    }

}
