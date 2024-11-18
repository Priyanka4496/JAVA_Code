/* Problem Description

Write a program that returns the list of positive elements that are present in the given list.


Input Format

The only argument is the given list of elements


Output Format

Return a list consisiting of the elements that are positive from the given list.


Example Input

-99 4 -2 -3 6 70 -8 14


Example Output

4 6 70 14


Example Explanation

Positive numbers from the list are 4,6,70 and 14 only

*/


import java.lang.*;
import java.util.*;
import java.util.ArrayList;

//Using ArrayList....

public class ListPosNum1DArrayList {
    public static void main(String[] args) {

        //Create a Input ArrayList

        ArrayList<Integer> InputList = new ArrayList<>();

        InputList.add(-99);
        InputList.add(4);
        InputList.add(-2);
        InputList.add(-3);
        InputList.add(6);
        InputList.add(70);
        InputList.add(-8);
        InputList.add(14);

        // Function Calling...
        ArrayList<Integer> OutputList = findpositivenumber(InputList);

        System.out.println("Input :" + InputList);
        System.out.println("Output :" + OutputList);

    }

    // Create a function

    public static ArrayList<Integer> findpositivenumber(ArrayList<Integer> arr) {
        int n = arr.size();

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int element = arr.get(i);

            if (element > 0) {
                ans.add(element);
            }
        }

        return ans;
    }

}
