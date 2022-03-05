package com.projeto.jedi.exercicioslista3;

import java.util.Scanner;

/**
 * Escreva um algoritmo para ler o número total de eleitores de um município
 * o número de votos brancos nulos e válidos.
 * Calcular e escrever o percentual que cada um
 * representa em relação ao total de eleitores
 */
public class Java05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o número de eleitores : ");
        int eleitores = scanner.nextInt();
        int votosBrancos , votosNulos , votosValidos;
        System.out.println("Número de Votos brancos :");
        votosBrancos = scanner.nextInt();
        System.out.println("Número de Votos nulos ");
        votosNulos = scanner.nextInt();
        System.out.println("Votos válidos :");
        votosValidos = scanner.nextInt();

        if(votosNulos < 0){
            System.out.println("Número imcopátivel :");
        }else {
            System.out.println("Quantidade de votos nulos " + votosNulos);
            System.out.println("Quantidade de votos nulos em porcentagem " + (votosNulos * 100) / eleitores ) ;
        }
        if (votosBrancos < 0){
            System.out.println("Número incompátivel");
        }else {
            System.out.println("Quantidade de votos brancons " + votosBrancos);
            System.out.println("Quantidade de votos brancos  em porcentagem " + ( votosBrancos  * 100) / eleitores ) ;
        }
        if(votosValidos < 0){
            System.out.println("Número incompátivel");
        } else {
            System.out.println("Quantidade de votos válidos " + votosValidos);
            System.out.println("Quantidade de votos válidos em porcentagem "+ (votosValidos * 100 )/ eleitores);
        }

    }
}
