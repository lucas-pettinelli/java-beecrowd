import java.io.IOException;
import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(n);

        int notas[] = { 100, 50, 20, 10, 5, 2, 1 };

        for (int nota : notas) {
            int quantidade = n / nota;
            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
            n %= nota;
        }
        scan.close();

    }
}
