/*
Problem Description

Take input an array A of size N and write a program to print maximum and minimum elements of the input. The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.

Problem constraints

1 <= N <= 1000

1 <= A <= 1000


Input Format

The first line contains a single integer N representing the length of the array A followed by N elements of the array A.


Output Format

A single line output containing two space-separated integers.
The first integer is the maximum value of the array.
The second integer is the minimum value of the array.


Example Input

Input 1:
5 1 2 3 4 5
Input 2:
4 10 50 40 80

Example Output

Output 1:
5 1
Output 2:
80 10
 */


import java.lang.*;
import java.util.*;

public class MaxMinElement1DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        System.out.println(max + " " + min);
    }
}


