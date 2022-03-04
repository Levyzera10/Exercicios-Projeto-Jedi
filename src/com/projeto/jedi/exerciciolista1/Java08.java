package com.projeto.jedi.exerciciolista1;

import java.util.Scanner;

/**
 * Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.
 */
public class Java08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idade = new int[20];
        int soma = 0;
        System.out.println("Digite idade de 20 pessoas" );
        for (int i = 0; i <= 19; i++) {
            idade[i] = scanner.nextInt();
            soma += idade[i];
            System.out.println(soma);
            if (idade[i] >= 18){
                System.out.println("Maior de idade :");
        }


        }
    }
}
