package com.projeto.jedi.exerciciolista1;

import java.util.Scanner;

/**
 * Leia o nome um número do usuário um número N e escreva o nome dele na tela N
 * vezes.
 */
public class Java04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu número ?");

        int numero = scanner.nextInt();
        for(;;){
            System.out.println(numero);
        }
    }
}
