package ExercícioBasico;

public class Exercicio15 {
    public static void main(String[] args){

/*
 Exercício nº15 -  Escrever um código que irá trocar o valor de 2 variaveis
usando uma variavel temporaria.
 */

        int a, b, temp;

        a = 15;
        b = 27;

        System.out.println("Troca esses rolê ai: a, b = " + a + " , " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Testando as saídas pós trocas: " + a + " , " + b);

    }
}