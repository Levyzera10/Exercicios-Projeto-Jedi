package com.projeto.jedi.ExerciciosLista2;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia uma sequência de números do usuário e realize a
 * soma desses números. Encerre a execução quando um número negativo for digitado
 */
public class Java15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int soma = 0;
        while (numero >= 0){
            if (numero >= 0){
                System.out.println("Digite um número");
                numero = scanner.nextInt();
                soma +=numero;
                System.out.println("Resultado " + soma);
            }
        }
    }
}

