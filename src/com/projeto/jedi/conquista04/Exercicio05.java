package com.projeto.jedi.conquista04;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Criar e inicializar um array de 10 posições que vai receber 10 valores inteiros. Criar também um fluxo que vai ler
 * o array e ao final exibir os seguintes dados:
 * Quantos valores são maiores que 15
 * Quantos valores são negativos
 * Quantos valores são múltiplos de 5
 * Qual a soma total dos valores
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] meuArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = 0;
        for(int i = 0; i<meuArray1.length;i++){
            System.out.println("Digite um número:");
            int numeroDigi = scanner.nextInt();
            if (numeroDigi > 15){
                System.out.println("Maior que 15");
            }if (numeroDigi < 0){
                System.out.println("negativo");
            }if(numeroDigi % 5 == 0){
                System.out.println("multiplo de 5");
            }
        }
    }
}
