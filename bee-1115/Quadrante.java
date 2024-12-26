/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

Entrada
A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.

Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.

Exemplo de Entrada	Exemplo de Saída
2 2
3 -2
-8 -1
-7 1
0 2

primeiro
quarto
terceiro
segundo
*/

import java.io.IOException;
import java.util.Scanner; 

public class Quadrante {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int X, Y;
        do{
            X = scan.nextInt();
            Y = scan.nextInt();
            if (X > 0 && Y > 0) {
				System.out.printf("primeiro\n");
			} else if (X < 0 && Y > 0) {
				System.out.printf("segundo\n");
			} else if (X < 0 && Y < 0) {
				System.out.printf("terceiro\n");
			} else if (X > 0 && Y < 0) {
				System.out.printf("quarto\n");
			}
        }while(X !=0 && Y !=0);
    
        scan.close();
    }
 
}
