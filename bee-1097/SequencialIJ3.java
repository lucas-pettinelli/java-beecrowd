import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int i = 1;
        int j = 7;
        
        while(i <= 9){
            for(int k = 0; k < 3; k++){
                System.out.println("I=" + i + " J=" +j);
                j--;
            }
            j+=5;
            i+=2;
        }
 
    }
 
}
