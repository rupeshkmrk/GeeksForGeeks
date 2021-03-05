package com.gfg.dsa.arrays.StrongestNeighbour;

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class StrongestNeighbour {

    // Function to find maximum for every adjacent pairs in the array.
    static void maximumAdjacent(int sizeOfArray, int arr[]) {

        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/
        String str = "";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < sizeOfArray; i++) {
            if (arr[i] > arr[i - 1]) {
                stringBuffer.append(arr[i]);
            } else {
                stringBuffer.append(arr[i - 1]);
            }
            stringBuffer.append(' ');
        }
        System.out.print(stringBuffer);

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

            StrongestNeighbour obj = new StrongestNeighbour();
            obj.maximumAdjacent(sizeOfArray, arr);

            System.out.println();
        }
    }
}


// } Driver Code Ends
