/*
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
 * diferença do produto de A e B pelo produto de C e D segundo a fórmula:
 * DIFERENCA = (A * B - C * D).
 * 
 * Entrada
 * O arquivo de entrada contém 4 valores inteiros.
 * 
 * Saída
 * Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo
 * abaixo, com um espaço em branco antes e depois da igualdade.
 * 
 * Exemplos de Entrada Exemplos de Saída
 * 5
 * 6
 * 7
 * 8
 * 
 * DIFERENCA = -26
 */

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        
        int diferenca = (a*b - c*d);
        
        System.out.println("DIFERENCA = " + diferenca);
        
        scan.close();
    }

}
