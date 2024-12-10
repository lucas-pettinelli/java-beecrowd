/*
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo

Exemplo de Entrada	Exemplo de Saída
I=1 J=60
I=4 J=55
I=7 J=50
...
I=? J=0
 */

public class SequenciaIJ1 {
    public static void main(String[] args) {
        for (int n = 0; ; n++) {
            int i = 1 + 3 * n;
            int j = 60 - 5 * n;
            if (i > j) break;
            System.out.printf("I=%d J=%d%n", i, j);
        }
    }
}
