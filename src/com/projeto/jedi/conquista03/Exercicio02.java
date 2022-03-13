package com.projeto.jedi.conquista03;

import java.util.Scanner;

/**
 * Criar um código que pede para o usuário inserir um valor numérico de 1 a 10, e caso o valor digitado seja diferente
 * desse intervalo, ele deve exibir uma mensagem pedindo para inserir o valor correto. O PROGRAMA NÃO PODE ENCERRAR ATÉ
 * O USUÁRIO COLOCAR O VALOR CORRETO.
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10 ");

        while (true) {
            int numeroDigitado = scanner.nextInt();
            if (numeroDigitado > 0 && numeroDigitado <11){
                break;
            } else {
                System.out.println("Número incorreto");
                System.out.println("Digite um número");
            }
        }
    }
}
