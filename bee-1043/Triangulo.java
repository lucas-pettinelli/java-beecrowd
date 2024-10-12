/*
 * Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:


Perimetro = XX.X


Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem


Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.

Exemplo de Entrada	Exemplo de Saída
6.0 4.0 2.0

Area = 10.0

6.0 4.0 2.1

Perimetro = 12.1
 */

import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
    
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        
        if((a + b > c) && (b + c > a) && (a + c > b)){
            float areaPerimetro = (a + b + c);
            System.out.printf("Perimetro = %.1f%n", areaPerimetro);
        }else{
            float areaTrapezio = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n", areaTrapezio);
        }
        scan.close();
    }
}
