public class Exercicio4 {
    public static void main(String[] args){
/*
#Exercício nº4 - Escrever um código para resolver 4 operações matemáticas
e depois imprimir no console os resultados, as fórmulas são:
a. -5+8*6 | deverá retornar 43
b. (55+9) %9 | deverá retornar 1
c. 20+ -3*5/8 | deverá retornar 19
d. 5+15/3*2-8%3 | deverá retornar 13
*/

        //#A
        int a1 = -5;
        int a2 = 8;
        int a3 = 6;
        int aresultado = a1 + a2 * a3;
        System.out.println(aresultado);

        //#B
        int b1 = 55;
        int b2 = 9;
        int bresultado = (b1 + b2) % b2;
        System.out.println(bresultado);

        //#C
        int c1 = 20;
        int c2 = -3;
        int c3 = 5;
        int c4 = 8;
        int cresultado = c1 + c2 * c3 / c4;
        System.out.println(cresultado);

        //#D
        int d1 = 5;
        int d2 = 15;
        int d3 = 3;
        int d4 = 2;
        int d5 = 8;
        int dresultado = d1 + d2 / d3 * d4 - d5 % d3;
        System.out.println(dresultado);
    }
}
