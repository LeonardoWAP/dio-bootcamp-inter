import java.util.Random;

/*
 * faça um programa que leia 20 numeros inteiros aleatorios (entre - e 100) armazene-os num vetor.
 * ao final mostre os numeros e seus sucessores 
 */

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorio = new int[20];

        for(int i = 0 ; i < numerosAleatorio.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorio[i] = numero;
        }

        System.out.print("Numeros Aleatorios : ");
        for (int numero : numerosAleatorio) {
            System.out.print(numero + " ");
        }

        System.out.print("\n Sucessores dos Numeros Aleatorio : ");
        for (int numero : numerosAleatorio) {
            System.out.print((numero + 1 )+ " ");
        }



    }
    
}
