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

        try{
            if(!(simbolo == "+" || simbolo == "-" || simbolo == "*" || simbolo == "/" )){
            System.out.println("Simbolo incorreto");
        }catch(){}

        System.out.println("O simbolo escolhido foi " + simbolo);
        System.out.println("Agora digite o primeiro valor a ser calculado: ");
        String num1 = scanner.nextLine();

        System.out.println("Agora digite o segundo valor a ser calculado: ");
        String num2 = scanner.nextLine();

        if (simbolo.equals("+")){
            Double valor1 = Double.parseDouble(num1);
            Double valor2 = Double.parseDouble(num2);

            Double soma = valor1 + valor2;

            System.out.println("A soma entre os números foi" + soma);

            return soma;
        }
        if(simbolo.equals("-")){
            Double valor1 = Double.parseDouble(num1);
            Double valor2 = Double.parseDouble(num2);

            Double sub = valor1 - valor2;

            System.out.println("A multiplicação do número foi" + sub);

            return sub;

        }
        if(simbolo.equals("*")){
            Double valor1 = Double.parseDouble(num1);
            Double valor2 = Double.parseDouble(num2);

            Double mult = valor1 * valor2;

            System.out.println("A multiplicação foi " + mult);

            return mult;
        }
        if(simbolo.equals("/")){

            Double valor1 = Double.parseDouble(num1);
            Double valor2 = Double.parseDouble(num2);

            Double div = valor1 / valor2;

            System.out.println("O valor da divisão foi " + div);

            return div;
        }

        return 0.0;
    }



}