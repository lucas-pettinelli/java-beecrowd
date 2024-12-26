/*
 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.

Entrada
A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

Saída
Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, caso contrário imprima a mensagem “Decrescente”.

Exemplo de Entrada	Exemplo de Saída
5 4
7 2
3 8
2 2

Decrescente
Decrescente
Crescente
 */

import java.io.IOException;
import java.util.Scanner; 

public class CrescenteDecrescente {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        while(x != y){
            if(x > y) System.out.println("Decrescente");
            else System.out.println("Crescente");
                x = scan.nextInt();
                y = scan.nextInt();
        }
        scan.close();
    }
}
