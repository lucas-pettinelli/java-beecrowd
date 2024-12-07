import java.io.IOException;
import java.util.Scanner;


public class SequenciaDeNumerosDeSoma {

    public static void main(String[] args) throws IOException {

    Scanner scan = new Scanner(System.in);

    int M, N;

    while (true) {
        M = scan.nextInt();
        N = scan.nextInt();

        if (M <= 0 || N <= 0) {
            break;
        }

        int soma = 0;
        if (M > N) {
            int temp = M;
            M = N;
            N = temp;
        }
        
        for (int i = M; i <= N; i++) {
            System.out.print(i + " ");
            soma += i;
        }
        
        System.out.println("Sum=" + soma);
    }
    
    scan.close();
    }
}