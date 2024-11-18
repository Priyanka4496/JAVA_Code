/* Problem Description

Write a program that reads an integer array A from input and modifies the array by shifting each element to the right by one position and by shifting the last element to the first position. Return the modified array.

Problem Constraints

1 <= N <= 105 1 <= A[i] <= 109
Input Format

The first line of the input is the size of the array N. The second line of the input is N integers of the array separated by space.

Output Format

Print a single line that is the elements of the modified array separated by space.

Example Input
5
1 2 3 4 5

Example Output
5 1 2 3 4

*/


import java.lang.*;
import java.util.*;

public class RightShift1DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int N = sc.nextInt();

        // Create an array of size N
        int[] A = new int[N];

        // Read the elements of the array
        for (int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }

        // Shift the elements to the right by one position
        int lastElement = A[N - 1];
        for (int i = N - 1; i > 0; i--)
        {
            A[i] = A[i - 1];
        }

        A[0] = lastElement;

        // Print the modified array
        for (int i = 0; i < N; i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}