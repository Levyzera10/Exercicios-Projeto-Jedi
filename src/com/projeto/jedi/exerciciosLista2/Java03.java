package com.projeto.jedi.exerciciosLista2;

/**
 * Informar um saldo e imprimir o saldo com reajuste de 1%.
 */
public class Java03 {
    public static void main(String[] args) {
        double saldo, reajuste , calculo;
        saldo = 3500;
        reajuste = 1.0 /100;
        calculo = (saldo * reajuste) + saldo;
        System.out.println(" Saldo com reajuste " + calculo);
    }
}
