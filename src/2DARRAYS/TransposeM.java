
import java.util.Scanner;

public class TransposeM {

    public static int[][] transpose(int matrix[][]){
        int row  = matrix.length;
        int col  = matrix[0].length;

        int transpose[][] = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = matrix[i][j]; 
            }
        }
        return transpose;    
    }

    public static void printM(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter no row");
        int row = sc.nextInt();
        System.out.print("enter no of col");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }


       System.out.println("Original Matrix:");
        printM(matrix);

        int transpose[][] = transpose(matrix);

        System.out.println("Transpose Matrix:");
        printM(transpose);

    }
}
