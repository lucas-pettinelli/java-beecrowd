/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

Entrada
A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 

Saída
Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.

Exemplo de Entrada	Exemplo de Saída
4
14
123
10
-25

2 in
2 out
 */

 import java.io.IOException;
 import java.util.Scanner;
public class Intervalo2 {
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int in = 0;
        int out = 0;
        
        for(int i = 0; i < N; i++){
            int X = scan.nextInt();
            if(X >= 10 && X <= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println(in + " in");
    	System.out.println(out + " out");
        scan.close();
    }
}

