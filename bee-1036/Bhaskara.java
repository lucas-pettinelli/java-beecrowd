import java.io.IOException;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        delta = (b * b) - (4 * a * c);
        if ((2 * a == 0) || (delta < 0)) {
            System.out.println("Impossivel calcular");
        } else {
            x1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);
        }
        scan.close();

    }
}
