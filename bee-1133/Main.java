import java.util.Scanner;
import java.IO.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);

		int x, y;

		x = scan.nextInt();
		y = scan.nextInt();

		if (y > x) {
			int aux = y;
			y = x;
			x = aux;
		}

		y++;
		for (; x > y; y++) {

			if ((y % 5 == 2 || y % 5 == 3) && !(y % 5 == 2 && y % 5 == 3))
				System.out.println(y);
		}
        scan.close();
    }
 
}