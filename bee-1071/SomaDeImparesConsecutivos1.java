/*
 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.

Exemplo de Entrada	Exemplo de Saída
6
-5

5

15
12

13

12
12

0
 */

import java.io.IOException;
import java.util.Scanner; 

public class SomaDeImparesConsecutivos1 {
 
    public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	int soma = 0;
		int X = scan.nextInt();
		int Y = scan.nextInt();

		if (X < Y) {
			for (int i = X + 1; i < Y; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		} else {
			for (int i= Y + 1; i < X; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}
		System.out.println(soma);
		scan.close();
    }
	
}
