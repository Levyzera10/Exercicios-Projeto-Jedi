package com.projeto.jedi.exerciciosLista2;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
 * mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
 * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias).
 */
public class Java01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade em anos , meses e dias  :");

        int anos, meses, dias;
        System.out.println(" quantos anos ? ");
        anos  = scanner.nextInt();

        System.out.println("quantos meses ?");

        meses = scanner.nextInt();

        System.out.println("quantos dias ?");

        dias  = scanner.nextInt();
        System.out.println(anos + " anos " + meses + " meses " + dias + " dias = " + (anos *365 + meses* 30 + dias))  ;
    }
}
