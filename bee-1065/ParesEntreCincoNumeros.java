/*
 * Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.

Exemplo de Entrada	Exemplo de Saída
7
-5
6
-4
12

3 valores pares
 */

import java.io.IOException;
import java.util.Scanner;

public class ParesEntreCincoNumeros {
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int contador = 0;
        
        for(int i = 0; i < 5; i++){
            numero = scan.nextInt();
            if(numero % 2 == 0){
                contador += 1;
            }
        }
        System.out.println(contador + " valores pares");
        scan.close();
    }
}
