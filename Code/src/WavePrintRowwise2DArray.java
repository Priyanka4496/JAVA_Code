/*
Problem Description
You are given an integer matrix mat and you have to print the elements of the matrix in wave form (row wise)

See example for clarifications regarding wave print.


Problem Constraints
1 <= N <= 103

0 <= Mat[i][j] <= 109



Input Format
First line is an integer N

Next N lines contain N space separated integers representing the matrix Mat



Output Format
A single line containing N*N integers of matrix Mat in wave form (row wise)



Example Input
Input 1:

[[4, 1, 2],
 [7, 4, 4],
 [3, 7, 4]]
Input 2:

[[1, 2],
 [3, 4]]


Example Output
Output 1:

4 1 2 4 4 7 3 7 4
Output 2:

1 2 4 3


Example Explanation
For Input 1:
We will first iterate the 1st row from left to right and print the elements,
then we will iterate the 2nd row from right to left and print the elements,
then we will iterate the 3rd row from left to right and print the elements.
This looks like a wave.
For Input 2:
We will first iterate the 1st row from left to right and print the elements,
then we will iterate the 2nd row from right to left and print the elements.
This looks like a wave.
*/


import java.lang.*;
import java.util.*;

public class WavePrintRowwise2DArray {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();

            //This is a NXN Matrix

        int[][] arr = new int[n][n];

        for (int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                arr[i][j] = sc.nextInt(); // Upto this point matrix is ready and add all element by user!!
            }
        }

        // Now Create a Waveform Row wise...Here check the Row line ODD and EVEN

        for (int i=0; i<arr.length; i++)
        {
            if(i%2 == 0)
            {
                for(int j=0; j<=arr.length-1; j++)  // 0 to m-1 this is even
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else
            {
                for (int j=arr.length-1; j>=0; j--) // m-1 to 0 this is Odd
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }
}


// 2nd Method

//import java.lang.*;
//import java.util.*;
//
//public class WavePrintRowwise2DArray {
//    public static void main(String[] args) {
//        // YOUR CODE GOES HERE
//        // Please take input and print output to standard input/output (stdin/stdout)
//        // DO NOT USE ARGUMENTS FOR INPUTS
//        // E.g. 'Scanner' for input & 'System.out' for output
//
//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        int[][] mat=new int[n][n];
//        for(int i=0;i<mat.length;i++)
//        {
//            for(int j=0;j<mat.length;j++)
//            {
//
//                mat[i][j] = sc.nextInt();
//
//            }
//        }
//        for(int i=0; i<mat.length; i++)
//        {   //row
//            if(i%2==0)
//            {
//                for(int j=0;j<=mat.length-1;j++) // 0 to m-1
//                {
//                    System.out.print(mat[i][j]+" ");
//                }
//            }
//            else
//            {
//                for(int j=mat.length-1;j>=0;j--) //m-1 to 0
//                {
//                    System.out.print(mat[i][j]+" ");
//                }
//            }
//        }
//    }
//}