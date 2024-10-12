import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class SortSimples {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int[] array = { a, b, c };
        Arrays.sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scan.close();
    }
}
