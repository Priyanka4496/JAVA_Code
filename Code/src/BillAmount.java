/* Problem Description

Given total bills amount and amount of a single bill. Print number of bills.

Note : The total amount is equally splitted in all bills. The number of bills should be an integer value.

Input Format

The first line contains a real number N denoting the total budget.
The second line contains an integer M denoting the value of a single bill.
Output Format

Print in a single line denoting the total number of bills that can fit in the total budget.
Problem Constraints

1 <= N <= 10000
1 <= M <= 100
Example Input

Input:-
126.3
5
Example Output

Output:-
25
Note: The problem constraints mean that when we test your code, the test cases used in the backend can have input values only within those constraints. You need not implement them in your code. You need to make sure your code will work for all such input values!  */

import java.lang.*;
import java.util.*;

public class BillAmount  {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        double N= sc.nextDouble();
        int M = sc.nextInt();
        System.out.print((int) N / M);
    }
}

