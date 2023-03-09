/*
 * faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuario
 *  Ex: 5! = 120 (5 x 4 x 3 x 2 x 1)
 */
import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial : ");
        int fatorial = scan.nextInt();

        int mult = 1;
        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1 ; i--){
            mult = mult * i;
        }
        System.out.print(mult);
        
    }
}
