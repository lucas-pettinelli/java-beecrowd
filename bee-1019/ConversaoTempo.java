/*
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

Exemplo de Entrada	Exemplo de Saída
556

0:9:16
 */
import java.io.IOException;
import java.util.Scanner;


public class ConversaoTempo {
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
        int totalSegundos = scan.nextInt();
        
        int hora = totalSegundos / 3600;
        int minuto = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;
        
        System.out.printf("%d:%01d:%01d%n", hora, minuto, segundos);
        
        scan.close();
 
    }
}
