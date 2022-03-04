package com.projeto.jedi.exerciciolista1;

import java.util.Scanner;

/**
 * Leia o nome do usuário e escreva o nome dele na tela 10 vezes
 */
public class Java03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva seu nome");
        String nome = scanner.nextLine();

        for (int i = 0; i < 11; i++) {
            System.out.println(nome);
        }

    }

}
