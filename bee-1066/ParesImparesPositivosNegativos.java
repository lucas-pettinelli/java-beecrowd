/*
 * Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.

Exemplo de Entrada	Exemplo de Saída
-5
0
-3
-4
12

3 valor(es) par(es)
2 valor(es) impar(es)
1 valor(es) positivo(s)
3 valor(es) negativo(s)
 */

import java.io.IOException;
import java.util.Scanner;

public class ParesImparesPositivosNegativos {
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int numero;
        int contadorPar = 0;
        int contadorImpar = 0;
        int contadorPositivos = 0;
        int contadorNegativo = 0;
        
        for(int i = 0; i < 5; i++){
            numero = scan.nextInt();
            if(numero %2 == 0) contadorPar++;
            else contadorImpar++;
            if(numero > 0) contadorPositivos++;
            else if(numero < 0) contadorNegativo++;
        }
        
        System.out.println(contadorPar + " valor(es) par(es)");
        System.out.println(contadorImpar + " valor(es) impar(es)");
        System.out.println(contadorPositivos + " valor(es) positivo(s)");
        System.out.println(contadorNegativo + " valor(es) negativo(s)");
        
        scan.close();
    }
}
