import java.io.IOException;
import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        double numero = scan.nextDouble();

        if (numero >= 0 && numero <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (numero > 25.0 && numero <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (numero > 50.0 && numero <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else if (numero > 75.0 && numero <= 100.0) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        scan.close();
    }
}
