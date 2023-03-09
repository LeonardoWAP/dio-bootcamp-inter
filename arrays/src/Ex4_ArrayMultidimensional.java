import java.util.Random;

/*
 * gere e imprema uma matriz M 4x4 com valores aleatorios entre 0-9
 */

 public class Ex4_ArrayMultidimensional{
    public static void main(String[] args) {
        Random random = new Random();


        int[][] M = new int[4][4];

        for(int i = 0 ; i < M.length ; i++){
            for (int j = 0 ; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz : ");
        for(int[] linha : M ){
            for(int Coluna : linha){
                System.out.print(Coluna + " ");
            }
            System.out.println();
        }
    }


 }
