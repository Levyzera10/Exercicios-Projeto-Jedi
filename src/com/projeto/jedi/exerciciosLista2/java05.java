package com.projeto.jedi.exerciciosLista2;

import java.text.DecimalFormat;

/**
 * Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
 * calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
 * (1SM=R$788,00)
 */
public class java05 {
    public static void main(String[] args) {
        double salarioUsu = 3500;
        double salarioMini = 788.00;
        DecimalFormat salario = new DecimalFormat("0.000");
        System.out.println("a quantidade de salários mínimos esse usuário ganha " + salario.format(salarioUsu / salarioMini));


    }
}
