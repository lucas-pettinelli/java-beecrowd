import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();

        int soma = a + b;

        System.out.printf("SOMA = %d%n", soma);

        entrada.close();
    }
}
