/* Problem Description
You are given array A and an integer B. You have to tell whether B is present in array A or not.



Problem Constraints
1 <= |A| <= 105

1 <= A[i], B <= 109



Input Format
Function template consists of two arguments:

An array of integers A.
An integer B


Output Format
Return 1 if the element exists, else return 0.



Example Input
Input 1:

A = [ 4 1 5 9 1 ]
B = 5
Input 2:


A = [ 7 7 2 ]
B = 1


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

  B = 5  is present at position 3 in A
Explanation 2:

  B = 1  is not present in A.

*/

import java.lang.*;
import java.util.*;

public class PresenCount1DArray {
    public static void main(String[] args) {

        int A1[] = {4,1,5,9,1};
        int B1 = 5;

        System.out.println("Output 1 : " + presentPosition(A1, B1));  //Function Calling

        int A2[] = {7,7,2};
        int B2 = 1;

        System.out.println("Output 2 : " + presentPosition(A2, B2));  //Function Calling
    }

    public static int presentPosition(int[] A, int B){

        int n = A.length;

        for(int i=0; i<n; i++)
        {
            if(A[i] == B)
            {
                return 1;
            }
        }

        return 0;
    }
}
