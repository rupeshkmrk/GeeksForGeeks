package com.gfg.dsa.arrays.Majority;

import java.util.*;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // input testcases

        while (t-- > 0) // Loop until we exhaust all testcases
        {
            int n = sc.nextInt(); // Input size of array n
            int arr[] = new int[n]; // Declaring the array
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                arr[i] = x; // Assigning elements to array
            }

            int x = sc.nextInt(); // Input x
            int y = sc.nextInt(); // Input y

            MajorityWins obj = new MajorityWins(); // object to call the function
            System.out.println(
                    obj.majorityWins(arr, n, x, y)); // The functions you complete
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class MajorityWins {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        int num1 = 0;
        int num2 = 0;
        for (int num :
                arr) {
            if (num == x) {
                num1++;
            } else if (num == y) {
                num2++;
            }
        }
        if (num1 > num2) {
            return x;
        } else if (num2 > num1) {
            return y;
        } else if (num1 == num2) {
            if (x < y)
                return x;
        }
        return y;
    }
}

