/*
 * Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.

Exemplos de Entrada	Exemplos de Saída
7.0 5.0 7.0

TRIANGULO ACUTANGULO
TRIANGULO ISOSCELES

6.0 6.0 10.0

TRIANGULO OBTUSANGULO
TRIANGULO ISOSCELES

6.0 6.0 6.0

TRIANGULO ACUTANGULO
TRIANGULO EQUILATERO

5.0 7.0 2.0

NAO FORMA TRIANGULO

6.0 8.0 10.0

TRIANGULO RETANGULO
 */

import java.io.IOException;
import java.util.*; 

public class TiposTriangulos {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        
        double[] lados = {a, b, c};
        Arrays.sort(lados);
        
        a = lados[2];
        b = lados[1];
        c = lados[0];
        
        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            }
            else if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scan.close();
    }
}

