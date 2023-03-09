/*
 * crie um vetor de 6 numeros inteiros e mostre os na ordem inversa
 */

public class Ex1_Ordeminversa {
    public static void main(String[] args) {

        int count = 0;
        int[] vetor = {0,-5,15,50,8,4};

        System.out.print(" Vetor : ");

         while(count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
         }

         System.out.print("\n Vetor : ");

         for (int i = (vetor.length-1);i >= 0; i-- ){
            System.out.print(vetor[i] + " ");
         }
    }
}
