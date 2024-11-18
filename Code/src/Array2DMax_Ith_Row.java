/*
Problem Description
Given 2D Array A[][] and Row index B, return max of Bth row.


Problem Constraints
1 <= A.length <= 103
1 <= A[i].length <= 103
-105<= A[i][j] <= 105
0 <= B < A.length



Input Format
Given two arguments A and B, in which A is 2D Array and B is an Integer.


Output Format
Return max value of ith row.


Example Input
Input 1 :

A = [[12, 65, 89, 74],
     [22, 44, 12, 30],
     [10, 12, 97, 19]]
B = 2
Input 2 :
A = [[12, 16, 19]
     [21, 23, 59]]
B = 1


Example Output
Output 1 :
97
Output 2 :
59
*/

import java.lang.*;
import java.util.*;

public class Array2DMax_Ith_Row {
    public static void main(String[] args) {

        // Example Input 1
        int[][] matrix1 = {
                {12, 65, 89, 74},
                {22, 44, 12, 30},
                {10, 12, 97, 19}
        };

        int rowIndex1 = 2;
        System.out.println("Output 1: " + findMaxInRow(matrix1, rowIndex1));

        // Example Input 2
        int[][] matrix2 = {
                {12, 16, 19},
                {21, 23, 59}
        };

        int rowIndex2 = 1;
        System.out.println("Output 2: " + findMaxInRow(matrix2, rowIndex2));
    }

    public static int findMaxInRow(int[][] matrix, int rowIndex){

        int n = matrix[0].length;

        int maxElement = Integer.MIN_VALUE;

        for(int j=0; j<n; j++)
        {
            int element = matrix[rowIndex][j];

            if(element > maxElement)
            {
                maxElement = element;
            }
        }

        return  maxElement;

    }
}
