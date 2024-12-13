import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class SequencialIJ4 {
 
    public static void main(String[] args) throws IOException {
 
        for (float i = 0; i <= 2.01; i += 0.2){
            for (int j = 1; j < 4; j ++){
                if (i == 0 || i == 1 || i >= 2){
                    System.out.printf("I=%.0f J=%.0f\n", i, j+i);
                }
                else{
                    System.out.printf("I=%.1f J=%.1f\n", i, j+i);
                }
            }
        }
    }
 
}
