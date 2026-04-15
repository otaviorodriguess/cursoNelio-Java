package matrizes;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // variavel n que foi lida
        int n = sc.nextInt();
        // os [] sao os que dizem que a matriz e bidemensional
        int[][] mat = new int[n][n];

        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0 ; j < mat[i].length ; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");

        for(int i = 0 ; i < mat.length ; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0 ;
        for(int i = 0 ; i <mat.length ; i++){
            for(int j = 0 ; j < mat[i].length ; j++){
                if (mat[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("Negatives numbers : "+ count);

        sc.close();
    }
}
