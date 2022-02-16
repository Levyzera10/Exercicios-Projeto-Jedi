package com.projeto.jedi.conquista02;

import java.util.Scanner;

/**
 * Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é
 * igual ao case (a, b, c e default). O código deve executar apenas o default com a mensagem:
 * “O valor não é compatível”.
 */

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha a letra a, b ou c.");
        String num = entrada.next();

        switch (num) {
            case "a":
                System.out.println("Você escolheu a letra a");
                break;
            case "b":
                System.out.println("Você escolheu a letra b");
                break;
            case "c":
                System.out.println("Você escolheu a letra c");
                break;
            default:
                System.out.println("O valor não é compatível");
        }
    }
}
