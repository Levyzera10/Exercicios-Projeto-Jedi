package com.projeto.jedi.conquista03;

/**
 * Criar um código que declara uma variável do tipo String com um nome qualquer que você quiser e dentro do for,
 * contado até 10, o valor da variável deve ser concatenado a ela mesma sempre que encontrar um valor par na variável
 * do índex.
 */
public class Exercicio04 {
    public static void main(String[] args) {

        String nome = "Levy";
        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                nome += "," + nome ;
                System.out.println(nome);
            }
        }

       for (int i = 0;i<10;i++){
           if (i % 2 == 0){
               nome += "," + nome;
               System.out.println(nome);
           }
       }


    }
}
