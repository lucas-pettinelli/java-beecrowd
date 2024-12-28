/*
 * A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS. Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols marcados pelos times em uma nova partida, caso contrário deve ser encerrado imprimindo:

- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).

Entrada
O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo Grêmio respectivamente. Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do programa.

Saída
Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". Quando o algoritmo for encerrado devem ser mostradas as estatísticas conforme a descrição apresentada acima. Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
3 2
1
2 3
1
3 1
2

Novo grenal (1-sim 2-nao)
Novo grenal (1-sim 2-nao)
Novo grenal (1-sim 2-nao)
3 grenais
Inter:2
Gremio:1
Empates:0
Inter venceu mais
 */

import java.io.IOException;
import java.util.Scanner; 

public class Grenais{
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int interVitorias = 9, gremioVitorias = 0, empates = 0, grenais =0;
        
        
        while(true){
            int golInter = scan.nextInt();
            int golGremio = scan.nextInt();
            grenais++;
            
            if(golInter > golGremio){
                interVitorias++;
            }else if(golGremio > golInter){
                gremioVitorias++;
            }else{
                empates++;
            }
            
            System.out.println("Novo grenal (1-sim 2-nao)");
            int resposta = scan.nextInt();
            if(resposta == 2){
                break;
            }
        }
            
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + interVitorias);
        System.out.println("Gremio:" + gremioVitorias);
        System.out.println("Empates:" + empates);
            
        if(interVitorias > gremioVitorias){
            System.out.println("Inter venceu mais");
        }else if(gremioVitorias > interVitorias){
            System.out.println("Gremio venceu mais");
        }else{
            System.out.println("Nao houve vencedor");
        }
        scan.close();
    }
}
