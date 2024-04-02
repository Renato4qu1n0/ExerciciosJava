import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

/*
#Exercício nº5 - Esse exercício pede para escrever um programa em Java que pegue 2 números
que terão entrada via teclado e realizar uma multiplicação dos 2 números.
A fórmula que foi solicitada é que o primeiro número seja 25 e o segundo seja 5 e o resultado
seja 125.
 */

        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        int mult = num1 * num2;
        System.out.println(mult);

    }
}
