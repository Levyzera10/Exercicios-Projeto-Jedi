package com.projeto.jedi.exercicioslista3;

import java.util.Scanner;

/**
 * Um usuário deseja um algoritmo onde possa escolher que tipo de média deseja
 * calcular a partir de 3 notas. Faça um algoritmo que leia as notas, a opção escolhida
 * pelo usuário e calcule a média.
 * 1 -aritmética
 * 2 -ponderada (pesos: 3,3,4)
 */
public class Java03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaPonderada = 0;
        double mediaAritmetica = 0;
        double nota[] = new double[3];

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite sua nota :");
            nota[i] = scanner.nextInt();
        }
        mediaAritmetica = (nota[0] + nota[1] + nota[2]) / 3;
        mediaPonderada = (nota[0] * 3 + nota[1] * 3 + nota[2] * 4) / (3 + 3 + 4);
        System.out.println("1 média ponderada  \n 2 média aritmética:");
        int numeroDigitado = scanner.nextInt();
        if(numeroDigitado == 1){
            System.out.println(mediaPonderada);
        }else if (numeroDigitado == 2){
            System.out.println(mediaAritmetica);
        }
        else{
            System.out.println("Média não encontrada");
        }
    }
}
