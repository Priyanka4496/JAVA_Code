/* Problem Description:

Write a program that returns the list of elements that are present in the given list and are divisible by 5 and 7.

Input Format:

The only argument is the given list of elements
Output Format:

Return a list consisting of the elements that are divisible by 5 and 7 from the given list.
Sample Input:

[23, 34, 25, 35, 66, 70, 14]
Sample Output:

[35, 70]
Sample explanation:

Only 35 and 70 are divisible by 5 and 7 from the list [23,34,25,35,66,70,14]
therefore the list consisting of only these two elements is returned.

*/


import java.lang.*;
import java.util.*;
import java.util.ArrayList;

//Using ArrayList....

public class Divisible5_7_1DArray
{
    public static void main(String[] args) {

        //Create a input arraylist

        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(23);
        inputList.add(34);
        inputList.add(25);
        inputList.add(35);
        inputList.add(66);
        inputList.add(70);
        inputList.add(14);

        // Function call
        ArrayList<Integer> outputList = findDivisibleBy5And7(inputList);

        // Print the result
        System.out.println("Sample Input: " + inputList);
        System.out.println("Sample Output: " + outputList);
    }

    public static ArrayList<Integer> findDivisibleBy5And7(ArrayList<Integer> arr)
    {
        int n = arr.size();

        //Create a 1D ArrayList
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++)
        {
            int target = arr.get(i);

            if((target % 5 == 0) && (target % 7 == 0))
            {
                ans.add(target);
            }
        }

        return ans;
    }
}