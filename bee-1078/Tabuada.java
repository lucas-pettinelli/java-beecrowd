/*
 * Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N

Entrada
A entrada contém um valor inteiro N (2 < N < 1000).

Saída
Imprima a tabuada de N, conforme o exemplo fornecido.

Exemplo de Entrada	Exemplo de Saída
140

1 x 140 = 140
2 x 140 = 280
3 x 140 = 420
4 x 140 = 560
5 x 140 = 700
6 x 140 = 840
7 x 140 = 980
8 x 140 = 1120
9 x 140 = 1260
10 x 140 = 1400
 */

import java.io.IOException;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i=1; i <= 10; i++){
            int resultado = i * n;
            System.out.printf("%d x %d = %d%n", i, n, resultado);
        }
        scan.close();
    }    
}
