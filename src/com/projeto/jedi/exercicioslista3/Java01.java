package com.projeto.jedi.exercicioslista3;

import java.util.Scanner;

/**
 *Crie um algoritmo que leia um número diferente de zero e diga se este número é
 * positivo ou negativo.
 */
public class Java01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número");
        int numero = scanner.nextInt();
        if(numero > 0){
            System.out.println("Positivo");
        }
        else if (numero < 0){
            System.out.println("Negativo");
        }
    }
}
