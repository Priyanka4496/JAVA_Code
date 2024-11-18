/*
Problem Description
Given a matrix of N rows and M columns, print it column by column. Firstly print 0th column, then 1st column, 2nd column and so on.


Problem Constraints
1 <= N <= 100
1 <= M <= 100
1 <= mat[i][j] <= 10000


Input Format
Two values denoting N and M,
Next N lines contain M space separated integers representing the matrix Mat


Output Format
M lines denoting each column


Example Input
3 4
10 20 30 40
50 60 70 80
90 100 110 120


Example Output
10 50 90
20 60 100
30 70 110
40 80 120


Example Explanation
0th column -> 10 50 90
1st column -> 20 60 100
2nd column -> 30 70 80
3rd column -> 40 80 120


*/



import java.lang.*;
import java.util.*;

public class Array2DMatrixColumbyColum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m =sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }


            for(int j=0; j<m; j++)
            {
                for (int i=0; i<n; i++)
                {
                    System.out.print(arr[i][j] + " ");
                }

                System.out.println();
            }
    }
}
