package com.projeto.jedi.conquista02;

import java.util.Scanner;

/**
 * Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é igual
 * ao case (1, 2, 3). Os cases devem escrever quando o valor for igual ao seu próprio.
 * Mostrando apenas a frase do case referente ao valor.
 */

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um número 1, git 2 ou 3:");
        int num = entrada.nextInt();

        switch (num) {
            case 1:
                System.out.println("Você escolheu o número 1");
                break;
            case 2:
                System.out.println("Você escolheu a letra  b : ");
                break;
            case 3:
                System.out.println("Você escolheu a letra  c : ");
                break;
            default:
                System.out.println("Valor não compatível");
        }
    }
}

