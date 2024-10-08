import java.io.IOException;
import java.util.Scanner;

/*
 * Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.

Exemplo de Entrada	Exemplo de Saída
7
-5
6
-3.4
4.6
12

4 valores positivos
 */

public class NumeroPositivos {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 6; i++) {
            double valor = scan.nextDouble();
            if (valor > 0)
                contador++;
        }
        System.out.println(contador + " valores positivos");
        scan.close();
    }

}
