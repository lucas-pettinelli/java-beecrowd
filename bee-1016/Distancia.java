/*
 * Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.

Entrada
O arquivo de entrada contém um número inteiro.

Saída
Imprima o tempo necessário seguido da mensagem "minutos".

Exemplo de Entrada	Exemplo de Saída
30

60 minutos
 */

import java.io.IOException;
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int distancia = scan.nextInt();

        int carroX = 60;
        int carroY = 90;
        double hora = 60.0;

        double velocidadeRelativa = (carroY - carroX) / hora;

        double tempo = distancia / velocidadeRelativa;

        System.out.println((int) tempo + " minutos");

        scan.close();

    }
}
