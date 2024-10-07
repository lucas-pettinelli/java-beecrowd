/*
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * CODIGO / ESPECIFIÇÃO / PREÇO
 * 1    /   Cachorro quente / 4.00
 * 2    / X-Salada /    4.50
 * 3    / X-Bacon / 5.0
 * 4    / Torrada / 2.0
 * 5    / Refrigerante / 1.5
 * 
 * Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
3 2

Total: R$ 10.00

4 3

Total: R$ 6.00

2 3

Total: R$ 13.50
 */

import java.io.IOException;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int codigo = scan.nextInt();
        int itens = scan.nextInt();

        if (codigo == 1) {
            System.out.printf("Total: R$ %.2f\n", 4.0 * itens);
        } else if (codigo == 2) {
            System.out.printf("Total: R$ %.2f\n", 4.50 * itens);
        } else if (codigo == 3) {
            System.out.printf("Total: R$ %.2f\n", 5.0 * itens);
        } else if (codigo == 4) {
            System.out.printf("Total: R$ %.2f\n", 2.0 * itens);
        } else if (codigo == 5) {
            System.out.printf("Total: R$ %.2f\n", 1.5 * itens);
        }
        scan.close();

    }
}
