package ExercícioBasico;

public class Exercicio11 {
    public static void main(String[] args){

/*
 Exercício nº11 - Escrever um código que irá retornar a área e perímetro
 do círculo, o raio do círculo é: 7.5
 */
        double pi = 3.14159;
        double raio = 7.5;
        double perim = 2 * pi * raio;
        double area = pi * raio * raio;

        System.out.println(perim);
        System.out.println(area);
    }
}