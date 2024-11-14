/*
 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.

Exemplo de Entrada	Exemplo de Saída
7
-5
6
-3.4
4.6
12

4 valores positivos
7.4
 */

import java.io.IOException;
import java.util.Scanner;

public class PositivoEMedia {
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        double media = 0;
        double x;
        
        for(int i=0; i<6; i++){
            x = scan.nextDouble();
            if(x > 0){
                contador++;
                media += x;
            }
        }
        
        media = media / contador;
        System.out.println(contador + " valores positivos");
        System.out.println(String.format("%.1f", media));
        
        scan.close();
    }
}
