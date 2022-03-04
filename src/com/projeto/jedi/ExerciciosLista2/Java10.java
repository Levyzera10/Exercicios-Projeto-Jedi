package com.projeto.jedi.ExerciciosLista2;

import java.util.Scanner;

/**
 * Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
 * multiplicação.
 */
public class Java10 {
    public static void main(String[] args) {
        System.out.println("Escreva um número :");
        Scanner scanner = new Scanner(System.in);
        int tabuada = scanner.nextInt();
        for( int i = 0; i <= 10; i++){
            System.out.println("Tabuada do:" + tabuada );
            System.out.println(i + "x"+ tabuada + "=");
            System.out.println(i * tabuada);
        }

    }
}
