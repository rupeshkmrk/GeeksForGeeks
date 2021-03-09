package com.gfg.dsa.arrays.Frequency;
// { Driver Code Starts

import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //testcases
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {

            //size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            //calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencycount(arr, n);

            //printing array elements
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


class Solution {
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencycount(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(arr)
                .forEach(value -> {
                    if (map.containsKey(value)) {
                        int count = map.get(value);
                        map.put(value, count + 1);
                    } else {
                        map.put(value, 1);
                    }
                });
        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i)) {
                arr[i - 1] = map.get(i);
            } else {
                arr[i - 1] = 0;
            }
        }
    }
}