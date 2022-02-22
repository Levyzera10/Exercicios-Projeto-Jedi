package com.projeto.jedi.ExerciciosLista;

/**
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
 * mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
 * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias).
 */
public class Java01 {
    public static void main(String[] args) {
        int anos, meses, dias;
        anos = 10;
        meses = 5;
        dias = 3;
        System.out.println(anos + " anos " + meses + " meses " + dias + " dias = " + ((365*10)+ (5*30) + 3 ));
    }
}
