/*
 * Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.

Exemplo de Entrada	Exemplo de Saída
8

9
11
13
15
17
19
 */

import java.io.IOException;
import java.util.Scanner;
public class SeisNumerosImpares {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        
        if(numero %2 == 0){
            numero++;
        }
        
        for(int i = 0; i < 6; i++){
            System.out.println(numero);
            numero += 2;
        }
        scan.close();
    }
}
