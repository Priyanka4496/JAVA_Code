/*
Problem Description
You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .



Problem Constraints
1 <= len(A) <= 1000

1 <= A[i] <= 100



Input Format
First argument is an array of integers representing array A.



Output Format
You have to return an array of integers as per the question.



Example Input
Input 1:

A = [1, 2, 5, 1, 5, 1 ]


Example Output
Output 1:

[3, 1, 2, 3, 2, 3]


Example Explanation
Explanation 1:

Clearly, In the given array we have 1 three times, 2 one time and 5 two times.


*/



import java.lang.*;
import java.util.*;
import java.util.ArrayList;

//Using ArrayList....

public class freqcount1DArrayList {
    public static void main(String[] args) {

        ArrayList<Integer>inputList = new ArrayList<>(); //Create a arraylist

        inputList.add(1);
        inputList.add(2);
        inputList.add(5);
        inputList.add(1);
        inputList.add(5);
        inputList.add(1);

        ArrayList<Integer> outputList = freqCount(inputList); // Function Calling

        System.out.println("Input:" + inputList);
        System.out.println("Output:" + outputList);

    }

    public static ArrayList<Integer> freqCount(ArrayList<Integer> A) {

        int n = A.size();

        ArrayList<Integer> ans = new ArrayList<>(); //Create a Output ArrayList

        for(int i=0; i<n; i++)
        {
            int ele1 = A.get(i);
            int count = 0;

            for(int j=0; j<n; j++)
            {
                int ele2 = A.get(j);

                if(ele1 == ele2)
                {
                    count++;

                }
            }

            ans.add(count);
        }

        return ans;
    }
}
