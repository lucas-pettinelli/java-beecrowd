/*
 * Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .

Exemplo de Entrada	Exemplo de Saída
7 8 9 10

O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)

7 7 7 7

O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)

7 10 8 9

O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)
 */

import java.io.IOException;
import java.util.Scanner;

public class TempoComMinutos {
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
        int horaInicial = scan.nextInt();
        int minutoInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        int minutoFinal = scan.nextInt();
 
         if (horaFinal < horaInicial || (horaFinal == horaInicial && minutoFinal < minutoInicial)) {
            horaFinal += 24;
        }
        
        int totalHora = horaFinal - horaInicial;
        int totalMinuto = minutoFinal - minutoInicial;
        
        if (totalMinuto < 0) {
            totalMinuto += 60;
            totalHora--;
        }
        
        if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + totalHora + " HORA(S) E " + totalMinuto + " MINUTO(S)");
        }
        
        scan.close();
    }
 
}

