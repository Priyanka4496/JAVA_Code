/*
Problem Description
Given 2D Array A[][], return min element from this matrix.


Problem Constraints
1 <= A.length <= 103
1 <= A[i].length <= 103
-103 <= A[i][j] <= 103


Input Format
First argument A is a 2D array of integers (2D matrix).


Output Format
Return the min element from the matrix.


Example Input
[7,2,3,4]
[5,6,1,8]
[9,2,3,4]


Example Output
1


Example Explanation
Min element of the entire matrix A is 1.

*/


import java.lang.*;
import java.util.*;
import java.util.ArrayList;

//Using ArrayList....

public class Array2DMinElementMatrix {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        A.add(new ArrayList<>(List.of(7, 2, 3, 4)));
        A.add(new ArrayList<>(List.of(5, 6, 1, 8)));
        A.add(new ArrayList<>(List.of(9, 2, 3, 4)));

        System.out.println("Output :" + minElement(A));
    }

    public static int minElement(ArrayList<ArrayList<Integer>> A){

        int n = A.size();
        int m = A.get(0).size();

        int minElement = Integer.MAX_VALUE;

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                int Element = A.get(i).get(j);

                if(Element < minElement)
                {
                    minElement = Element;
                }
            }
        }

        return minElement;
    }
}
