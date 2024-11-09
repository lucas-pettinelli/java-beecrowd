/*
 * Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.
 */

import java.util.Scanner;

public class TempoDeUmEvento {
    public static void main(String[] args) {
        final int SEGUNDOS_EM_UM_DIA = 86400;
        final int SEGUNDOS_EM_HORA = 3600;
        final int SEGUNDOS_EM_MINUTO = 60;
        
        Scanner scan = new Scanner(System.in);
        
        scan.next();
        int inicioDia = scan.nextInt();
        int iniciaHora = scan.nextInt();
        scan.next();
        int inicioMinuto = scan.nextInt();
        scan.next();
        int inicioSegundos = scan.nextInt();
 
        scan.next();
        int fimDia = scan.nextInt();
        int fimHora = scan.nextInt();
        scan.next();
        int fimMinutos =scan.nextInt();
        scan.next();
        int fimSegundos = scan.nextInt();
        
        int inicioEmSegundos = (inicioDia * SEGUNDOS_EM_UM_DIA) + (iniciaHora * SEGUNDOS_EM_HORA) + (inicioMinuto * SEGUNDOS_EM_MINUTO) + inicioSegundos;
        int fimEmSegundos = (fimDia * SEGUNDOS_EM_UM_DIA) + (fimHora * SEGUNDOS_EM_HORA) + (fimMinutos * SEGUNDOS_EM_MINUTO) + fimSegundos;
        int duracaoEmSegundos = fimEmSegundos - inicioEmSegundos;
        
        int dias = duracaoEmSegundos / SEGUNDOS_EM_UM_DIA;
        duracaoEmSegundos %= SEGUNDOS_EM_UM_DIA;
        int horas = duracaoEmSegundos / SEGUNDOS_EM_HORA;
        duracaoEmSegundos %= SEGUNDOS_EM_HORA;
        int minutos = duracaoEmSegundos / SEGUNDOS_EM_MINUTO;
        int segundos = duracaoEmSegundos % SEGUNDOS_EM_MINUTO;
        
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
        
        scan.close();
    }
}
