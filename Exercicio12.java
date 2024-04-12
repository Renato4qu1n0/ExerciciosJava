package ExercícioBasico;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){

/*
 Exercício nº12 - Escreva um programa que receberá 3 números e esses 3 números
 devem ser somados e divididos exibindo a média.
 */
        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double soma = a + b + c;
        double media = soma / 3;

        System.out.println("A média dos valores somados é: " + media );

    }
}
