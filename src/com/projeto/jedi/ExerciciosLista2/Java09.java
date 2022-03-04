package com.projeto.jedi.ExerciciosLista2;

import java.util.Scanner;

/**
 * Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.
 */
public class Java09 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        int[] idades = new int[10];
        int pessoaMaisNova = 500;
        String nomePessoaMaisNova = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome e a idade de 10 pessoas");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "nome");
            nomes[i] = scanner.next();
            System.out.println((i + 1) + "idade");
            idades[i] = scanner.nextInt();
            if(idades[i]<pessoaMaisNova){
                pessoaMaisNova = idades[i];
                nomePessoaMaisNova = nomes[i];
            }
            System.out.println("A pessoa mais nova "+ nomePessoaMaisNova + "Idade da pessoa mais nova "+ "anos");
        }


    }
}
