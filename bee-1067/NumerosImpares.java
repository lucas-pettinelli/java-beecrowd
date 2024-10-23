/*
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

Exemplo de Entrada	Exemplo de Saída
8

1
3
5
7
 */

import java.util.Scanner;
import java.io.IOException;

public class NumerosImpares {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        Integer x = scan.nextInt();

        for (int i = 1; i <= x; i += 2) {
            System.out.println(i);
        }

        scan.close();

    }
}
