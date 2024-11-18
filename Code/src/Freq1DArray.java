/* Given an integer array A. Find and return the frequency of number B in array A.


Problem Constraints
1 <= |A| <= 105
1 <= A[i] <= 109
1 <= B <= 109


Input Format
The first argument is an integer array A.
The second argument is an integer B.


Output Format
Return the frequency of B in the array A.


Example Input
Input 1:-
A = [1, 1, 2, 4, 2]
B = 2
Input 2:-
A = [4, 2, 3, 4, 4]
B = 4


Example Output
Output 1:-
2
Output 2:-
3


Example Explanation
Explanation 1:-
There are two occurences of 2 in array A.
Explanation 2:-
There are three occurences of 4 in array A.

*/

import java.lang.*;
import java.util.*;

public class Freq1DArray
{
    public static void main(String[] args) {

        int[] A1 = {1, 1, 2, 4, 2};  //Input 1
        int B1 = 2;

        System.out.println("Output 1: " + findFrequency(A1, B1)); // Output: 2

        int[] A2 = {4, 2, 3, 4, 4};  //Input 2
        int B2 = 4;

        System.out.println("Output 2: " + findFrequency(A1, B1)); // Output: 3

    }

    //Create a Function bcz in que return the value that means using function

    public static int findFrequency(int[] A, int B)
    {
        int n = A.length;
        int freq_count = 0;

        for(int i=0; i<n; i++)
        {
            int element = A[i];

            if(element == B)
            {
                freq_count++;
            }
        }

        return freq_count;
    }

}

