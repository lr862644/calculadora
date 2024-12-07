package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //como criar uma variavel
        // 1 tipo: integer, Double, Float
        // 2 Nome qualquer nome que faça sentido

        Double n1 = 4.0;
        Double n2 = 6.0;
        Double n3 = 6.0;
        Double n4 = 5.0;

        Double resultadoMedia;

        Integer resultadoSoma;

        resultadoMedia = variaveis.calculaMedia(n1, n2, n3, n4);
        System.out.println(resultadoMedia);


        Double total = Double.valueOf(variaveis.calculadora());

        System.out.println(total);

    }

}