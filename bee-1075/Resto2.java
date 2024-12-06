import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Resto2 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if (i % N == 2) {
                System.out.println(i);
            }
        }

        scan.close();
    }
}