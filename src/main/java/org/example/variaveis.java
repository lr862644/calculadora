package org.example;

import java.util.Scanner;

public class variaveis {


    // como criar um metodo?
    // 1 Restrição public, private,protectd
    //002
    // 2 Retorno: void, integer,Double, float, Boolean
    // 3 Nome: define o nome do metodo
    // 4 ():Parenteses
    // 5 {}: Determina onde o metodo inicia e onde termina

    public static Integer somaNumeros(Integer x, Integer y){

        return x + y;

    }
    public static Double calculaMedia(Double n1,  Double n2, Double n3, Double n4){

        return (n1 + n2 + n3 + n4) / 4;

    }
    public static Double calculadora() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qual operação básica você deseja fazer? ");
        System.out.println("Digite um simbolo: + ou - ou  * ou /");

        String simbolo = scanner.nextLine();

        if(! (simbolo.equals("+") || simbolo.equals("-") || simbolo.equals("*") || simbolo.equals("/") ) ) {
            throw new NumberFormatException("Simbolo incorreto");
        }


        System.out.println("O simbolo escolhido foi " + simbolo);
        System.out.println("Agora digite o primeiro valor a ser calculado: ");
        Double valor1 = scanner.nextDouble();

        System.out.println("Agora digite o segundo valor a ser calculado: ");
        Double valor2 = scanner.nextDouble();

        if (simbolo.equals("+")){

            Double soma = valor1 + valor2;

            System.out.println("A soma entre os números foi" + soma);

            return soma;
        }
        if(simbolo.equals("-")){

            Double sub = valor1 - valor2;

            System.out.println("A multiplicação do número foi" + sub);

            return sub;

        }
        if(simbolo.equals("*")){

            Double mult = valor1 * valor2;

            System.out.println("A multiplicação foi " + mult);

            return mult;
        }
        if(simbolo.equals("/")){

            Double div = valor1 / valor2;

            System.out.println("O valor da divisão foi " + div);

            return div;
        }

        throw new NumberFormatException("Simbolo incorreto");
    }



}