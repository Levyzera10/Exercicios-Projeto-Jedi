package com.projeto.jedi.exerciciosLista2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Escrever um algoritmo que lê:
 * - a porcentagem do IPI a ser acrescido no valor das peças
 * - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
 * - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
 * O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
 * Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */

public class Java04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantidae e valor unitário de peças e quantidades");
        System.out.println("Quantidade  peça 1 :");
        int peca1 = scanner.nextInt();
        System.out.println("Valor peça 1 :");
        double valorUnitPeca1 = scanner.nextInt();
        System.out.println(" quantidade peça 2 :");
        int peca2 = scanner.nextInt();
        System.out.println("Valor peça 2 :");
        double valorUnitPeca2 = scanner.nextInt();
        final double ipi = 10;
        DecimalFormat deci = new DecimalFormat("0.00");
        System.out.println("Valor total das peças mais imposto :" + deci.format((valorUnitPeca1 * peca1 + valorUnitPeca2 * peca2) * (ipi / 100 + 1)));
        double resultado = (valorUnitPeca1 * peca1 + valorUnitPeca2 * peca2) * (ipi / 100 + 1);
        System.out.println("Valor do imposto " + deci.format(resultado -(valorUnitPeca1 * peca1 + valorUnitPeca2 * peca2) ));

    }
}
