package com.projeto.jedi.conquista01;

/**
 * Criar um código que verifica expressões booleanas (verdadeiro ou falso)
 * utilizando operadores de comparação e operadores lógicos.
 * Ex: boolean ativo = true; ativo == true && ativo != false
 */

public class Exercicio07 {
    public static void main(String[] args) {
        boolean verificacao = true;
        int idade1 = 10;
        int idade2 = 5;

        if( idade1 < idade2 || idade1 % 2 == 0){
            System.out.println("correto");
        }
        if( idade1 > idade2 && idade1 % 2 == 0){
            System.out.println("correto");
        }
    }
}
