import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){

/*
Exercício nº7 - Realizar um código que fará a tabuada do número inserido no console até o 10
no exercício proposto é para realizar a tabuada do 8. Será necessário usar Looping então essa
será a primeira vez que usarei ele em um código.
 */

        System.out.println("Entre com o número que você quer saber a tabuada.");
        Scanner in = new Scanner(System.in);

        int tabu = in.nextInt();
        for (int i = 0; i < 10; i++)
        System.out.println(tabu + "x" + (i + 1) + "=" + (tabu * (i + 1)));


    }
}
