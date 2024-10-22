/*
 * A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:


Salário	Percentual de Reajuste
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

15%
12%
10%
7%
4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais) e o percentual de reajuste ganho, conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
400.00

Novo salario: 460.00
Reajuste ganho: 60.00
Em percentual: 15 %

800.01

Novo salario: 880.01
Reajuste ganho: 80.00
Em percentual: 10 %

2000.00

Novo salario: 2140.00
Reajuste ganho: 140.00
Em percentual: 7 %
 */


import java.io.IOException;
import java.util.Scanner;

public class AumentoSalario {

    public class Main {
        public static void main(String[] args) throws IOException {

            Scanner scanner = new Scanner(System.in);
            double salarioFuncionario = scanner.nextDouble();

            double reajuste;
            if (salarioFuncionario <= 400.0) {
                reajuste = salarioFuncionario * 0.15;
            } else if (salarioFuncionario <= 800.0) {
                reajuste = salarioFuncionario * 0.12;
            } else if (salarioFuncionario <= 1200.0) {
                reajuste = salarioFuncionario * 0.10;
            } else if (salarioFuncionario <= 2000.0) {
                reajuste = salarioFuncionario * 0.07;
            } else {
                reajuste = salarioFuncionario * 0.04;
            }

            double percentualAjuste = (reajuste / salarioFuncionario) * 100;
            double novoSalario = salarioFuncionario + reajuste;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: %.0f %%\n", percentualAjuste);

            scanner.close();

        }
    }

}
