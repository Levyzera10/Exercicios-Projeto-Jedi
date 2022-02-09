package com.projeto.jedi.conquista01;

/**
 * Criar um código que compara valores iguais, maiores e menores para variáveis de tipos diferentes. Ex: int numero1 = 20;
 * long numero2 = 20; numero1 == numero2. (utilizar: int, long, double, float e short)
 */
public class exercicio06 {
    public static void main(String[] args) {
        int numero1 = 10;
        float numero2 = 5;
        long numero3 = 15;
        double numero4 = 20;
        short numero5 = 25;

        System.out.println(numero1 == numero2);


        System.out.println(numero3 != numero4);


        System.out.println(numero4 < numero5);
    }
}

