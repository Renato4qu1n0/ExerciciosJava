package ExercícioBasico;

import java.util.Scanner;

public class Exercicio17{
    public static void main(String[] args){

/*
 #Exercício nº17 - O exercício consiste em definir duas variáveis binárias com os números:
 10 e 11, a soma desses 2 números deve retornar 101.
 */
        long bin1, bin2;
        int i = 0, resto = 0;

        int[] s = new int[20];

        Scanner in = new Scanner(System.in);

        System.out.print("Entre com o primeiro número binário: ");
        bin1 = in.nextLong();

        System.out.print("Entre com o segundo número binário: ");
        bin2 = in.nextLong();

        while (bin1 != 0 || bin2 != 0)
        {
            s[i++] = (int)((bin1 % 10 + bin2 % 10 + resto) % 2);
            resto = (int)((bin1 % 10 + bin2 % 10 + resto) / 2);
            bin1 = bin1 / 10;
            bin2 = bin2 / 10;
        }

        if (resto != 0) {
            s[i++] = resto;
        }

        --i;

        System.out.print("Soma dos dois números binários: ");
        while (i >= 0) {
            System.out.print(s[i--]);
        }

        System.out.print("\n");

        /*
         Nunca havia realizado essa expressão, mesmo após validar a resposta retornou erro.
         Erros acontecem, vamos seguir porque um dia dará certo.
         Um dia após retornar erro, hoje dia 22/04/2024, vi que o erro era apenas eu que
         estava tentando importar o util.scanner antes do pacote, após inverter, deu certo.
         */
    }
}
