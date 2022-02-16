package com.projeto.jedi.conquista02;

import java.util.Scanner;

/**
 * Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é igual ao case (a, b, c e default).
 * O código deve executar apenas o default com a mensagem: “O valor não é compatível”.
 */

public class exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um número de 1 a 3");
        int num = entrada.nextInt();

        switch (num) {
            case 1:
                System.out.println("Você escolheu o número 1:");
                break;
            case 2:
                System.out.println("Você escolheu o número 2: ");
                break;
            case 3:
                System.out.println("Você escolheu o numero 3: ");

            default:
                System.out.println("Número inválido");
        }
    }
}
