/*
Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
34
56
44
23
-2

39.25


*/

import java.io.IOException;
import java.util.Scanner; 

public class Idades {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int contagem = 0;
        
        while(true){
            int idade = scan.nextInt();
            if(idade < 0){
                break;
            }
            soma += idade;
            contagem++;
        }
        if(contagem > 0){
            double media = (double) soma / contagem;
            System.out.printf("%.2f%n", media);
        }
        scan.close();
    }
 
}
