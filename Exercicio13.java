package ExercícioBasico;

public class Exercicio13 {
    public static void main(String[] args){

/*
 Exercício nº13 - Escrever um código em Java para resolver a área e perímetro
 de um retângulo que tem Largura = 5.5 e Altura = 8.5
 */

        double largura = 5.5;
        double altura = 8.5;

        double area = largura * altura;
        double perim = 2 * (largura + altura);

        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + perim);

    }
}
