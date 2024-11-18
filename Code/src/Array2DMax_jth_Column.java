/*
Problem Description
Given 2D Array A[][] and Column index B, return max of Bth column.


Problem Constraints
1 <= A.length <= 103
1 <= A[0].length <= 103
-105<= A[i][j] <= 105


Input Format
Given two argument A and B, in which A is 2D Array and B is an Integer.


Output Format
Return max value of Bth column.


Example Input
Input 1 :
A :
12 65 89 74
22 44 12 30
10 12 97 19

B : 0

Input 2 :
A :
12 16 19
21 23 59

B : 1


Example Output
Output 1 :
22

Output 2 :
23


Example Explanation
Explanation 1:
The max element of 0th indexed col is 22.

Explanation 2:
The max element of 1st indexed col is 23.

*/


import java.lang.*;
import java.util.*;

public class Array2DMax_jth_Column {
    public static void main(String[] args) {

        // Example Input 1
        int[][] matrix1 = {
                {12, 65, 89, 74},
                {22, 44, 12, 30},
                {10, 12, 97, 19}
        };

        int columnIndex1 = 0;
        System.out.println("Output 1: " + findMaxInColumn(matrix1, columnIndex1));

        // Example Input 2
        int[][] matrix2 = {
                {12, 16, 19},
                {21, 23, 59}
        };

        int columnIndex2 = 1;
        System.out.println("Output 2: " + findMaxInColumn(matrix2, columnIndex2));
    }

    public static int findMaxInColumn(int[][] matrix, int columnIndex){

        int n = matrix.length;

        int maxElement = Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            int element = matrix[i][columnIndex];

            if(element > maxElement)
            {
                maxElement = element;
            }
        }

        return  maxElement;

    }
}
