/* Problem Description

Write a program to print sum of elements of the input array A of size N.

Note: the size element is removed from the list passed as input to the function main, that is only elements are present. User is supposed to add them up and return the result


Problem Constraints

1 <= N <= 1000

1 <= A <= 1000



Input Format

A list of length N



Output Format

A single integer containing sum of elements from the input array.



Example Input

Input 1:

5 1 2 3 4 5
Input 2:

4 10 50 40 80


Example Output

Output 1:

15
Output 2:

180

Sample Explanation:

Input-1:
A = [5, 1, 2, 3, 4, 5]
here the first element is the size of A and the remaining elements are [1, 2, 3, 4, 5]
which all sum to 15

Input-1:
A = [4, 10, 50, 40, 80]
here the first element is the size of A and the remaining elements are [10, 50, 40, 80]
which all sum to 180*/



import java.lang.*;
import java.util.*;

public class SumofElement_Array {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
