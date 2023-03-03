/*
 * faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo
 * representando sua idade 
 * (pae o programa inserindo o valor 0 no campo nome)
 * 
 */
import java.util.Scanner;;

public class Ex1_NomeIdade{
    public static void main(String[]ãrgs) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        
        while(true){
            System.out.print("nome : ");
            nome = scan.next();

            if(nome.equals("0")) break;

            System.out.print("Idade : ");
            idade = scan.nextInt();
        }
        System.out.print("terminou de rodar ");
    }
}