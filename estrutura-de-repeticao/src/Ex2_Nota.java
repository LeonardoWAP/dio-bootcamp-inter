/*Faça um programa que peça uma nota , entre zero e dez.
 * mostre uma mensagem  caso o valor seja inválido
 * e continue pedindo
 * até que o usúario informe um valor válido
 */
import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        int nota ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nota de 0 a 10 : ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.print("Valor precisa estar entre 0 a 10 , Favor inserir novamente : ");
            nota = scan.nextInt();
        }
    }
}

