package com.projeto.jedi.conquista04;

import java.util.Scanner;

/**
 * Criar e inicializar um array de inteiros de tamanho 10
 * . Criar também um fluxo que vai ler os dados desse array e
 * ao
 * final dizer quantos valores são pares e quantos são ímpares
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TODO apenas inicializar os valores e dizer quantos impares e pares
        System.out.println("digite o número :");
        int[] meuArray = new int[10];
        for (int i = 0; i < meuArray.length; i++) {
            int numerosDigi = scanner.nextInt();
            if (numerosDigi % 2 == 0) {
                System.out.println("PAR");
            }
            if (numerosDigi % 2 != 0) {
                System.out.println("Impar");
            }
        }
    }
}
