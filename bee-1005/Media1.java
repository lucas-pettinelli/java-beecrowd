import java.io.IOException;
import java.util.Scanner; 

public class Media1 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner entrada = new Scanner(System.in);
       double notaA = entrada.nextDouble();
       double notaB = entrada.nextDouble();
       
       double pesoA = 3.5;
       double pesoB = 7.5;
       
       double media = (notaA * pesoA + notaB * pesoB) / (pesoA + pesoB);
       
       System.out.printf("MEDIA = %.5f%n", media);
       
       entrada.close();
 
    }
 
}