/*
 * Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.

Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)

Exemplo de Entrada	Exemplo de Saída
3
3 -2
-8 0
0 8

-1.5
divisao impossivel
0.0
 */

import java.io.IOException;
import java.util.Scanner;

public class DividindoXPorY {
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int x, y;
        
        for(int i=0; i < N; i++){
            x = scan.nextInt();
            y = scan.nextInt();
            if(y == 0){
                System.out.println("divisao impossivel");
            }else{
                System.out.println((double) x / y);
            }
        }
        scan.close();
    }
}