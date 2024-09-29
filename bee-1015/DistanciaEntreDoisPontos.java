import java.io.IOException;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {

    /**
     * IMPORTANT:
     * O nome da classe deve ser "Main" para que a sua solução execute
     * Class name must be "Main" for your solution to execute
     * El nombre de la clase debe ser "Main" para que su solución ejecutar
     */

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f%n", distancia);

        scan.close();
    }

}
