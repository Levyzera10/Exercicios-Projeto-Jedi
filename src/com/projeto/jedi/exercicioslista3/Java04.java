package com.projeto.jedi.exercicioslista3;

import java.util.Scanner;

/**
 * Escrever um algoritmo que lê um valor inteiro, calcula o fatorial desse número e
 * mostra o resultado.
 */
public class Java04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int fat = 1;
        int valor = scanner.nextInt();
        for( int i = 2; i <= valor; i++ )
        {
            fat *= i;
        }

        System.out.println( "O fatorial de " + valor + " é igual a " + fat );
    }
    }

