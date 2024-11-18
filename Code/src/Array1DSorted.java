/* Problem Description
Given an array A, check if it is sorted in non-decreasing order or not.

Non-decreasing order means that the numbers in a sequence can stay the same or increase, but they cannot decrease.


Problem Constraints
1 <= Ai <= 109
1 <= |A| <= 105


Input Format
The first and only argument contains an integer array A.


Output Format
Return 1 if array is sorted else return 0.


Example Input
Input 1:
 A = [1, 2, 2]
Input 2:
 A = [1, 2, 1]


Example Output
Output 1:
 1
Output 2:
 0


Example Explanation
Explanation 1:
We can see that the array elements are in non-decreasing order.
Explanation 2:
Second element is greater than the third element thus array is not in ascending order, hence not sorted.
*/

import java.lang.*;
import java.util.*;

public class Array1DSorted {
    public static void main(String[] args) {

        int A1[] = {1,2,2};
        System.out.println("Output 1 :" + elementSort(A1)); //Function Calling

        int A2[] = {1,2,1};
        System.out.println("Output 2 :" + elementSort(A2)); //Function Calling

    }

    public static int elementSort(int[] A){
        int n = A.length;

        for(int i=0; i<n-1; i++)   // Here iterate 0 to n-1...bcz array started 0 and upto n-1...so and every element will check so
        {
            if(A[i] > A[i+1])
            {
                return 1;
            }
        }

        return 0;
    }
}
