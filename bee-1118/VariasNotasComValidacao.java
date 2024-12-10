import java.io.IOException;
import java.util.Scanner; 
/**
Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. Calcule e imprima a média semestral. O programa só deverá aceitar notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que informe um código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de todo o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.

Entrada
O arquivo de entrada contém vários valores reais, positivos ou negativos. Quando forem lidas duas notas válidas, deve ser lido um valor inteiro X . O programa deve parar quando o valor lido para este X for igual a 2.

Saída
Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”. Quando duas notas válidas forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.

Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta mensagem deve ser apresentada novamente se o valor da entrada padrão para X for menor do que 1 ou maior do que 2, conforme o exemplo abaixo.

A média deve ser impressa com dois dígitos após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
-3.5
3.5
11.0
10.0
4
1
8.0
9.0
2

nota invalida
nota invalida
media = 6.75
novo calculo (1-sim 2-nao)
novo calculo (1-sim 2-nao)
media = 8.50
novo calculo (1-sim 2-nao)
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            double nota1 = -1, nota2 = -1;

            while (nota1 < 0 || nota1 > 10) {
                System.out.print("");
                double entrada = scan.nextDouble();
                if (entrada >= 0 && entrada <= 10) {
                    nota1 = entrada;
                } else {
                    System.out.println("nota invalida");
                }
            }

            while (nota2 < 0 || nota2 > 10) {
                System.out.print("");
                double entrada = scan.nextDouble();
                if (entrada >= 0 && entrada <= 10) {
                    nota2 = entrada;
                } else {
                    System.out.println("nota invalida");
                }
            }

            double media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f\n", media);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = scan.nextInt();
            } while (opcao != 1 && opcao != 2);

        } while (opcao == 1);

        scan.close();
    }
}
