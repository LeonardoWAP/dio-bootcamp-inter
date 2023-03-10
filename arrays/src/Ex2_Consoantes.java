/*
 * faça um programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas 
 * imprima as consoantes.
 */
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoantes = 0;

        int count =0;
        do{
            System.out.println("Letra : ");
            String letra = scan.next();


            if (!(letra.equalsIgnoreCase("a") |
                  letra.equalsIgnoreCase("e") |
                  letra.equalsIgnoreCase("i") |
                  letra.equalsIgnoreCase("o") |
                  letra.equalsIgnoreCase("u") |
                  letra.equalsIgnoreCase("a")) ){
                    consoantes[count] = letra;
                    count ++;
                  }
                  
            

        }while(count < consoantes.length);

        for(String consoante : consoantes ){
            if(consoante != null){
                System.out.print(consoante + " ");
            }
        }
    }
    
}
