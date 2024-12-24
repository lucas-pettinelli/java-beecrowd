/*
 * Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, inclusive ambos se for o caso.

Sample Input	Sample Output
100
200

13954
 */

import java.util.Scanner;

public class MultiplosDe13{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int soma = 0;
        
        int menor = Math.min(X, Y);
        int maior = Math.max(X, Y);

        for(int i=menor; i<=maior; i++){
            if(i%13 != 0){
                soma+=i;
            }
        }
        System.out.println(soma);
        scan.close();
    }
}