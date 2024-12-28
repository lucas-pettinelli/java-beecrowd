/*
 * Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.

Exemplo de Entrada	Exemplo de Saída
7

1 2 3 PUM
5 6 7 PUM
9 10 11 PUM
13 14 15 PUM
17 18 19 PUM
21 22 23 PUM
25 26 27 PUM
 */
import java.util.Scanner;
import java.io.IOException;

public class PUM{
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int contador = 1;
        
        for(int i = 0; i < N; i++){
            System.out.println(contador + " " + (contador + 1) + " " + (contador + 2) + " PUM");
            contador+=4;
        }
        scan.close();
    }
}