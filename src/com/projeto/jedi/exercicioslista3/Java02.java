package com.projeto.jedi.exercicioslista3;

import java.util.Scanner;

/**
 * Crie um algoritmo que receba 3 números e informe qual o maior entre eles
 */
public class Java02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor[] = new int[3];
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < valor.length; i++) {
            System.out.println("Digite o número :");
            valor[i] = scanner.nextInt();
            if (valor[i] > maior) {
                maior = valor[i];

            }
        }
        for (int j = 0; j < valor.length ;j++){
            if (valor[j] < menor){
                menor = valor[j];
            }
        }
        System.out.println("Maior valor "+ maior);
        System.out.println("Menor valor "+ menor);
    }
}
