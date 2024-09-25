import java.io.IOException;
import java.util.Scanner;

public class ProdutoSimples {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        int valorA = entrada.nextInt();
        int valorB = entrada.nextInt();

        int prod = valorA * valorB;

        System.out.printf("PROD = %d%n", prod);

        entrada.close();

    }

}