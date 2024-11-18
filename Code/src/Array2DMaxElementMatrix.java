/* Problem Description
Given a 2D Array A[][], return max element from this matrix.


Problem Constraints
0 < total row, total col <= 1000
-100000 <= A[i][j] <= 100000


Input Format
Single Argument A which is a 2D array.


Output Format
Return maximum element from matrix.


Example Input
Input 1 :
A = [ [12, 65, 89, 74],
      [22, 44, 12, 30],
      [10, 12, 97, 19] ]
Input 2 :
A = [ [12, 16, 19],
      [21, 23, 59] ]


Example Output
Output 1:
97
Output 2:
59


Example Explanation
Explanation 1:
Max element of matrix is 97.
Explanation 2:
Max element of matrix is 59.
*/


import javax.lang.model.element.Element;
import java.lang.*;
import java.util.*;
import java.util.ArrayList;

//Using ArrayList....

public class Array2DMaxElementMatrix {
    public static void main(String[] args) {

        // Example Input 1
        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>();
        matrix1.add(new ArrayList<>(List.of(12, 65, 89, 74)));
        matrix1.add(new ArrayList<>(List.of(22, 44, 12, 30)));
        matrix1.add(new ArrayList<>(List.of(10, 12, 97, 19)));

        System.out.println("Output 1: " + findMaxElement(matrix1));

        // Example Input 2
        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>();
        matrix2.add(new ArrayList<>(List.of(12, 16, 19)));
        matrix2.add(new ArrayList<>(List.of(21, 23, 59)));

        System.out.println("Output 2: " + findMaxElement(matrix2));
    }

    public static int findMaxElement(ArrayList<ArrayList<Integer>> matrix) {

        int n = matrix.size();  //Row size
        int m = matrix.get(0).size(); //Column size

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int maxElement = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int Element = matrix.get(i).get(j); //Get the value and store in variable element

                if (maxElement < Element)
                {
                    maxElement = Element; // Element = matrix.get(i).get(j)
                }
            }
        }

        return maxElement;

    }
}

