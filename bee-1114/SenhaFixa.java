/*
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. 

Entrada
A entrada é composta por vários casos de testes contendo valores inteiros.

Saída
Para cada valor lido mostre a mensagem correspondente à descrição do problema.

Exemplo de Entrada	Exemplo de Saída
2200
1020
2022
2002

Senha Invalida
Senha Invalida
Senha Invalida
Acesso Permitido
 */

import java.util.Scanner;
import java.io.IOException;

public class SenhaFixa{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        while(true){
            int senha = scan.nextInt();
            
            if(senha == 2002){
                System.out.println("Acesso Permitido");
                break;
            }else{
                System.out.println("Senha Invalida");
            }
        }
        scan.close();
    }
}