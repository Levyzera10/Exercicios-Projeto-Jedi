package com.projeto.jedi.conquista02;

/**
 * Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor
 * qualquer, não atendendo em nenhum momentos as 3 condições e finalizando o fluxo no ELSE
 */
public class Exercicio03 {
    public static void main(String[] args) {
        int idade = 17;

        if (idade == 18) {
            System.out.println("Idade = 18 anos");
       } else if (idade > 19 && idade % 2 == 0){
            System.out.println("true");
        } else if (idade >= 20 || idade % 2 == 0 ){
            System.out.println(true);
        } else {
            System.out.println("falso");
        }
    }
}
