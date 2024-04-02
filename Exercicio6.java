import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){

/*
Exercício nº6 - Escrever um programa em Java que contenha as seguintes expressões arítmeticas:
soma, multiplicação, subtração, divisão e resto da divisão.
Número a ser inserido> 125
Segundo número> 24
 */

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int entrada1 = in.nextInt();
        System.out.println("Digite o segundo número: ");
        int entrada2 = in.nextInt();

        int mais = entrada1 + entrada2;
        System.out.println("O resultado da soma é: " + mais);
        int mult = entrada1 * entrada2;
        System.out.println("O resultado da multiplicação é: " + mult);
        int menos = entrada1 - entrada2;
        System.out.println("O resultado da subtração é: " + menos);
        int div = entrada1 / entrada2;
        System.out.println("O resultado da divisão é: " + div);
        int rest = entrada1 % entrada2;
        System.out.println("O resto da divisão é: " + rest);



    }
}
