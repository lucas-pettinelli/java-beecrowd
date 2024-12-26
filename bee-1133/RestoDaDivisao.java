/*
 * Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.

Entrada
O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.

Sample Input	Sample Output
10
18

12
13
17
 */

import java.util.Scanner;
import java.io.IOException;

public class RestoDaDivisao {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);

		int x, y;

		x = scan.nextInt();
		y = scan.nextInt();

		if (y > x) {
			int aux = y;
			y = x;
			x = aux;
		}

		y++;
		for (; x > y; y++) {

			if ((y % 5 == 2 || y % 5 == 3) && !(y % 5 == 2 && y % 5 == 3))
				System.out.println(y);
		}
        scan.close();
    }
 
}