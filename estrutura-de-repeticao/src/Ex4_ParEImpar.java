/*
 * faça um programa que peça N numeros inteiros, 
 * calcule e mostre a quantidade de numeros pares 
 * e a  quantidade de numeros impares.
 */
import java.util.Scanner;

public class Ex4_ParEImpar {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero;

    int qtdPares = 0 , qtdImpares =0;


    int qtdNumeros;


    System.out.println("Quantidade de numeros : ");
    qtdNumeros = scan.nextInt();

    int count = 0;
    do{
        System.out.print("Número: ");
        numero = scan.nextInt();

        if (numero % 2 == 0) qtdPares ++;
        else qtdImpares ++;




        count = count +1;
    }while(count < qtdNumeros);

    System.out.println("Quantidade de pares : " + qtdPares);
    System.out.println("Qauntidade de impares : " + qtdImpares);

    }
    
}
