package com.gfg.dsa.arrays.MissingNumber;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// } Driver Code Ends


class Solution {

    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int n) {

        int ptr = 0;

        // Check if 1 is present in array or not
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                ptr = 1;
                break;
            }
        }

        // If 1 is not present
        if (ptr == 0)
            return (1);

        // Changing values to 1
        for (int i = 0; i < n; i++)
            if (arr[i] <= 0 || arr[i] > n)
                arr[i] = 1;

        // Updating indices according to values
        for (int i = 0; i < n; i++)
            arr[(arr[i] - 1) % n] += n;

        // Finding which index has value less than n
        for (int i = 0; i < n; i++)
            if (arr[i] <= n)
                return (i + 1);

        // If array has values from 1 to n
        return (n + 1);
       /* ArrayList<Integer> li = new ArrayList<>();
       Arrays.stream(arr).filter(value -> value > 0)
               .forEach(value -> li.add(value));
        for(int i = 1;i<= li.size();i++){
            if(!li.contains(i)){
                return i;
            }
        }
        return li.size() + 1;*/
        /*int lastNum = 0;
        Arrays.sort(arr);
        for (int i = 0; i <= size; i++) {
            if (!checkNum(arr, i)) {
                return i;
            }
            lastNum = i;
        }
        return lastNum + 1;*/
    }

    static boolean checkNum(int[] arr, int num) {
        for (int n :
                arr) {
            if (n == num || num == 0)
                return true;
        }
        return false;
    }

}


// { Driver Code Starts.

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking testcases
        int t = sc.nextInt();
        while (t-- > 0) {

            //input number n
            int n = sc.nextInt();
            int[] arr = new int[n];

            //adding elements to the array
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            Solution obj = new Solution();

            //calling missingNumber()
            int missing = obj.missingNumber(arr, n);
            System.out.println(missing);
        }
    }
}
