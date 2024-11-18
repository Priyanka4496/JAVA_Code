/* Problem Description
Given an array A[] and an element B, return the index of element B in array (0 based indexing).
If element is not present in array, return -1.


Problem Constraints
0 < A.length <= 10000
-100000 <= A[i], B <= 100000


Input Format
Given two Arguments 1D Integer Array A and Integer B.


Output Format
Return index of element B from array if element present, otherwise return -1.


Example Input
Input 1 :
A[] : 12 26 25 21 18 10 45 40 29 30
B : 40

Input 2 :
A[] : 12 28 23 21 18 15 14 40 12 30 10 19
B : 45


Example Output
Output 1 :
7

Output 2 :
-1


Example Explanation
Explanation 1 :
In array [12 26 25 21 18 10 45 40 29 30], element B = 40 is present at index 7.

Explanation 2 :
In array [12 28 23 21 18 15 14 40 12 30 10 19], element B = 45 is not present in array so answer is -1.
 */

import java.lang.*;
import java.util.*;

public class CountIndex1DArray {
    public static void main(String[] args) {

        int A1[] = {12, 26, 25, 21, 18, 10, 45, 40, 29, 30};
        int B1 = 40;

        System.out.println("Output 1 : " + positionOfB(A1, B1)); //function calling

        int A2[] = {12, 28, 23, 21, 18, 15, 14, 40, 12, 30, 10, 19};
        int B2 = 45;

        System.out.println("Output 2 : " + positionOfB(A2, B2)); //function calling
    }

    //Create a function....

    public static int positionOfB(int[] A, int B){

        int n = A.length;

        for(int i=0; i<n; i++)
        {
            if(A[i] == B) {
                return i;
            }
        }

        return -1;
    }
}
