import java.util.Scanner;
import java.io.IOException;

public class Media3 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        float n1 = scan.nextFloat();
        float n2 = scan.nextFloat();
        float n3 = scan.nextFloat();
        float n4 = scan.nextFloat();

        float media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            float notaExame = scan.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", notaExame);

            float mediaFinal = (media + notaExame) / 2;

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", mediaFinal);
        }
        scan.close();
    }
}