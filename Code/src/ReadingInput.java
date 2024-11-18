/* Problem Description
Given two numbers A and B. Multiply them and print the product.

Problem Constraints

105 <= A, B <= 106

Input Format
Two space separated integers A and B in the first line.

Output Format
Print in a single line the product of A and B.

Example Input
Input 1: 100000, 1000000

Input 2: 1000000, 10000000

Example Output
Output 1: 100000000000

Output 2: 10000000000000

Example Explanation
Explanation 1: 100000 * 1000000 = 100000000000.

Explanation 2: 1000000 * 10000000 = 10000000000000. */

import java.lang.*;
import java.util.*;

public class ReadingInput  {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); int B = sc.nextInt();
        System.out.print((long)A*B);
        // long C = A*B;        // That is give error bcz in o/p format give properly result and compiler is given by random value!!
        // System.out.println(C);
    }
}
