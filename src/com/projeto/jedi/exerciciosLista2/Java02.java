package com.projeto.jedi.exerciciosLista2;

/**
 * Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
 * números 4, 5 e 6. A soma das duas médias. A média das médias.
 */
public class Java02 {
    public static void main(String[] args) {
        float media1, media2, soma, mediafinal;
        media1 = (8 + 9 + 7) / 3;
        media2 = (4 + 5 + 6) / 3;
        mediafinal = (media1 + media2) / 2;
        System.out.println("A média aritmética de 8 , 9 e 7 é : " + media1);
        System.out.println("A média aritmética de 4 , 5 e 6 é : " + media2);
        System.out.println("A média final  é : " + mediafinal);

    }
}
