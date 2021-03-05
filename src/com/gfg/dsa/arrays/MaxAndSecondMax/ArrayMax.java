package com.gfg.dsa.arrays.MaxAndSecondMax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends


// Solution class to implement function largestAndSecondLargest
class ArrayMax {

    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
        Arrays.sort(arr);
        int max = arr[sizeOfArray - 1];
        int secondMax = -1;
        for (int i = sizeOfArray - 2; i >= 0; i--) {
            if (arr[i] != max) {
                secondMax = arr[i];
                break;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, max);
        list.add(1, secondMax);
        return list;
    }
}

// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {
            int sizeOfArray = Integer.parseInt(br.readLine());

            int arr[] = new int[sizeOfArray];

            String line = br.readLine();
            String[] elements = line.trim().split("\\s+");

            for (int index = 0; index < sizeOfArray; index++) {
                arr[index] = Integer.parseInt(elements[index]);
            }

            ArrayMax obj = new ArrayMax();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.largestAndSecondLargest(sizeOfArray, arr);
            System.out.println(res.get(0) + " " + res.get(1));
        }
    }
}  // } Driver Code Ends