import java.io.IOException;
import java.util.Scanner;

public class ValidacaoDeNota {
    
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double somaNotas = 0;
        int notasValidas = 0;

        while (notasValidas < 2) {
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                notasValidas++;
            } else {
                System.out.println("nota invalida");
            }
        }

        System.out.printf("media = %.2f%n", somaNotas / 2);
        scan.close();
    }
}
