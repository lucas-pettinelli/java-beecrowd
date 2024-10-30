/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
16 2

O JOGO DUROU 10 HORA(S)

0 0

O JOGO DUROU 24 HORA(S)

2 16

O JOGO DUROU 14 HORA(S)
 */

import java.io.IOException;
import java.util.Scanner; 

public class TempoDeJogo {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        Integer horaInicial = scan.nextInt();
        Integer horaFinal = scan.nextInt();
        
        if(horaInicial > horaFinal){
            System.out.println("O JOGO DUROU " + (24 - (horaInicial - horaFinal)) + " HORA(S)");
        }else if(horaFinal > horaInicial){
            System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");
        }else{
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        
        
        scan.close();
    }
}