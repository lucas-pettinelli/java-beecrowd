/*
 * Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor, deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.

Entrada
A entrada contém um único valor inteiro.

Saída
Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira letra em maiúscula.

Exemplo de Entrada	Exemplo de Saída
4

April
 */
import java.util.Scanner; 

 
public class Mes {
 
 
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
         
        String[] meses = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
         
        int mes = scan.nextInt();
         
        if(mes >= 1 && mes <= 12){
            System.out.println(meses[mes - 1]);
        }
        scan.close();
    }
     
}
