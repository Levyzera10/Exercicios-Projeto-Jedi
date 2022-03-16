package com.projeto.jedi.exerciciosLista2;

import java.util.Scanner;

/**
 * Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
 * antecessor e seu sucessor
 */
public class Java06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu número inteiro :");
        int inteiro = scanner.nextInt();
        System.out.println( "sucessor é igual " + (inteiro + 1) + "\nAntecessor é igual " + (inteiro -1) );
    }
}
