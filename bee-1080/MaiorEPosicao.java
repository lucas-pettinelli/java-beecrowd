/*
 * Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
2
113
45
34565
6
...
8
 

34565
4
 */

import java.io.IOException;
import java.util.Scanner;

public class MaiorEPosicao {
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
        int posicao = 0;
        int maiorValor = 0;
        
        for(int i=1; i <= 100; i++){
            int n = scan.nextInt();
            
            if(n > maiorValor){
                maiorValor = n;
                posicao = i;
            }
        }
        System.out.println(maiorValor);
        System.out.println(posicao);
        
        scan.close();
    }
 
}

