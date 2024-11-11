/*
 * Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.



Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.

Exemplos de Entrada	Exemplos de Saída
vertebrado
mamifero
onivoro

homem

vertebrado
ave
carnivoro

aguia

invertebrado
anelideo
onivoro

minhoca
 */


import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        String A = scan.next();
        String B = scan.next();
        String C = scan.next();
        
        if(A.equals("vertebrado") && B.equals("ave") && C.equals("carnivoro")){
            System.out.println("aguia");
        }else if(A.equals("vertebrado") && B.equals("ave") && C.equals("onivoro")){
            System.out.println("pomba");
        }else if(A.equals("vertebrado") && B.equals("mamifero") && C.equals("onivoro")){
            System.out.println("homem");
        }else if(A.equals("vertebrado") && B.equals("mamifero") && C.equals("herbivoro")){
            System.out.println("vaca");
        }
        
        if(A.equals("invertebrado") && B.equals("inseto") && C.equals("hematofago")){
            System.out.println("pulga");
        }else if(A.equals("invertebrado") && B.equals("inseto") && C.equals("herbivoro")){
            System.out.println("lagarta");
        }else if(A.equals("invertebrado") && B.equals("anelideo") && C.equals("hematofago")){
            System.out.println("sanguessuga");
        }else if(A.equals("invertebrado") && B.equals("anelideo") && C.equals("onivoro")){
            System.out.println("minhoca");
        }
        
        scan.close();
    }
}
