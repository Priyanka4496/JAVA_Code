/* Problem Description
Given an array A[] and an element B.
Return Count of element which are greater than B.


Problem Constraints
0 < A.length <= 10000
-100000 <= A[i], B <= 100000


Input Format
Given two arguments, first is array A and second is Integer B


Output Format
Return count of element which are greater than B.


Example Input
Input 1 :
A = [12 26 25 21 18 10 45 40 29 30]
B = 25

Input 2 :
A = [22 28 23 21 18 15 24 40 12 30 10 19]
B = 20


Example Output
Output 1 :
5

Output 2 :
7

Example Explanation
Explanation 1 :
In array [12 26 25 21 18 10 45 40 29 30],
Element B = 25, element which are greater than B are 26 45 40 29 30.
Count of element is 5.

Explanation 2 :
In array [22 28 23 21 18 15 24 40 12 30 10 19],
Element B = 20, element which are greater than B are 22 28 23 21 24 40 30.
Count of element is 7.

*/



import java.lang.*;
import java.util.*;

public class CountEle1DArray {
    public static void main(String[] args) {

        int A1[] = {12,26,25,21,18,10,45,40,29,30};
        int B1 = 25;

        System.out.println("Output 1 : " + elementGreaterB(A1, B1));  //Function Calling

        int A2[] = {22,28,23,21,18,15,24,40,12,30,10,19};
        int B2 = 20;

        System.out.println("Output 1 : " + elementGreaterB(A2, B2));  //Function Calling

    }

    public static int elementGreaterB(int[] A, int B){

        int n = A.length;
        int count = 0;

        for(int i=0; i<n; i++)
        {
            if(A[i] > B)
            {
                count++;
            }
        }

        return count;
    }
}
