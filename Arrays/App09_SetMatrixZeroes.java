package Arrays;

import java.util.Scanner;

public class App09_SetMatrixZeroes {

    static void changeValues(int[][] mat , int R , int C , int rowsize , int colsize){

        int i = R;
        int j = C;

        // right side
        while(j<colsize){
            if(mat[i][j] != 0){
                mat[i][j] = -1;
                j++;
            }
            else{
                j++;
            }
        }

        // left side
        i = R;
        j = C;
        while(j>=0){
            if(mat[i][j] != 0){
                mat[i][j] = -1;
                j--;
            }
            else{
                j--;
            }
        }

        // upper side
        i = R;
        j = C;
        while(i>=0){
            if(mat[i][j] != 0){
                mat[i][j] = -1;
                i--;
            }
            else{
                i--;
            }
        }

        // down side
        i = R;
        j = C;

        while(i<rowsize){
            if(mat[i][j] != 0){
                mat[i][j] =-1;
                i++;
            }
            else{
                i++;
            }
        }



    }

    static void setMatrixZero(int[][] mat , int rowsize , int colsize){
        for (int i = 0; i <rowsize ; i++) {
            for (int j = 0; j <colsize ; j++) {
                if(mat[i][j] == 0){

                    changeValues(mat,i,j,rowsize,colsize);
                }
            }
        }
        for (int i = 0; i <rowsize ; i++) {
            for (int j = 0; j <colsize ; j++) {
                if(mat[i][j] == -1){
                    mat[i][j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("ROW = "+mat.length);
        System.out.println("COL= "+mat[0].length);

        setMatrixZero(mat,row,col);

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
/*
3 4
0 1 2 0
3 4 5 2
1 3 1 5
*/