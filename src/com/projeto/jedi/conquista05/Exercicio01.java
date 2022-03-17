package com.projeto.jedi.conquista05;

import java.util.Arrays;

/**
 * Criar um array do tipo String de 10 posições e inicializar.
 * Para cada iteração do for, o valor da posição deve ser
 * concatenado ao valor da variável ex:
 * Nome
 * Nome nome
 * Nome nome casa
 */
public class Exercicio01 {
    public static void main(String[] args) {

        String[] meuArray2 = {"nao", "cite", "a", "Magia ", "Profunda", "para", "mim", "feiticeira ", "eu ", "estavala" };
        String nome = " ";
        for (int i = 0; i < meuArray2.length; i++) {
            nome +=" "+ meuArray2[i];
            System.out.println(nome);
        }

    }
}

