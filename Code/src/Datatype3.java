/* Que:-
* Problem Description
Given three numbers A, B and C. Add them and print the sum.


Input Format
Three space separated integers A, B, and C in the first line.


Output Format
Print in a single line the sum of A, B and C.


Example Input
Input 1: 2 3 -1

Input 2: 7 -4 0

Example Output
Output 1: 4

Output 2: 3

Example Explanation
Explanation 1: 2 + 3 + (-1) = 4.

Explanation 2: 7 + (-4) + 0 = 3. */
import java.lang.*;
import java.util.*;

public class Datatype3  {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); int B = sc.nextInt(); int C = sc.nextInt();
        System.out.print(A+B+C);

    }
}