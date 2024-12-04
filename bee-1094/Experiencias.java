import java.io.IOException;
import java.util.Scanner; 
public class Experiencias {

    public static void main(String[] args) throws IOException {
     
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int coelhos=0, ratos=0, sapos =0, total=0;
            
        for(int i=0; i < N; i++){
            int quantidade = scan.nextInt();
            char tipo = scan.next().charAt(0);
            total += quantidade;
                
            switch(tipo){
                case 'C':
                    coelhos += quantidade;
                    break;
                case 'R':
                    ratos += quantidade;
                    break;
                case 'S':
                    sapos += quantidade;
                    break;
            }
        }
            
        double percentualCoelhos = (double) coelhos / total * 100;
        double percentualRatos = (double) ratos / total * 100;
        double percentualSapos = (double) sapos / total * 100;
            
        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);
        
        scan.close();
    }
     
}
