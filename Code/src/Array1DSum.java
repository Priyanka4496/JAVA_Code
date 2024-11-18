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

180 */

import java.lang.*;
import java.util.*;

public class Array1DSum{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.print(sum);
    }
}
