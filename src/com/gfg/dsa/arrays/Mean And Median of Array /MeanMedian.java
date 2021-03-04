package com.geeksforgeeks.practice.easy;
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class MeanMedian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //testcase
        int T = sc.nextInt();

        //looping testcase
        while (T-- > 0) {
            Solution obj = new Solution();
            int N;

            //number of elements in array
            N = sc.nextInt();
            int a[] = new int[N];

            //inseting elements in the array
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                a[i] = x;
            }

            //calling mean() and median() functions
            System.out.println(obj.mean(a, N) + " " + obj.median(a, N));


        }

    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    //Function to find median of the array elements.
    public int median(int A[], int N) {
        int median = 0;
        Arrays.sort(A);
        if (N % 2 == 0) {
            int x = N / 2;
            median = (A[x] + A[x - 1]) / 2;
            return median;
        }
        int x = (N / 2);
        return A[x];
    }

    //Function to find median of the array elements.
    public int mean(int A[], int N) {
        int sum = Arrays.stream(A).sum();
        return sum / N;
    }

}

/*
* Given an array arr[] of size N and two elements x and y, use counter variables to find which element appears most in the array, x or y. If both elements have the same frequency, then return the smaller element.
Note:  We need to return the element, not its count.



Example 1:

Input:
N = 11
arr[] = {1,1,2,2,3,3,4,4,4,4,5}
x = 4, y = 5
Output: 4
Explanation:
frequency of 4 is 4.
frequency of 5 is 1.


Example 2:

Input:
N = 8
arr[] = {1,2,3,4,5,6,7,8}
x = 1, y = 7
Output: 1
Explanation:
frequency of 1 is 1.
frequency of 7 is 1.
Since 1 < 7, return 1.


Your Task:
You don't need to read input or print anything. Complete the function majorityWins() that takes array, n, x, y as input parameters and return the element with higher frequency.



Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)



Constraints:
1 <= n <= 103
0 <= arri , x , y <= 108
* */
