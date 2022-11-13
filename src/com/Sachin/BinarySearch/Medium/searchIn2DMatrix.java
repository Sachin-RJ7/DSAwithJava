package com.Sachin.BinarySearch.Medium;

import java.util.Arrays;

public class searchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {41,8,2,48,18},
                {16,15,9,7,44},
                {48,35,6,38,28},
                {3,2,14,15,33},
                {39,36,13,46,42}
        };
        System.out.println(Arrays.toString(searchIn2D(matrix)));
    }

    public static int[] searchIn2D(int[][] arr) {
        int startRow = 0;
        int endRow = arr.length - 1;

        while (endRow >= startRow) {
            int middleRow = startRow + (endRow - startRow) / 2;

            int rowMax = maxRowElementPosition(arr[middleRow], arr[middleRow].length - 1);

            // Firstly check, middle row is the first row
            if (middleRow == 0) {
                if (arr[middleRow][rowMax] > arr[middleRow + 1][rowMax]) {
                    return new int[] {middleRow, rowMax};
                }
            }

            // Check, middle row is the last row
            if (middleRow == arr.length - 1) {
                if (arr[middleRow][rowMax] > arr[middleRow - 1][rowMax]) {
                    return new int[] {middleRow, rowMax};
                }
            }

            // checking max element of the row with its upper and lower row
            if (arr[middleRow][rowMax] > arr[middleRow + 1][rowMax] && arr[middleRow][rowMax] > arr[middleRow - 1][rowMax]) {
                return new int[] {middleRow, rowMax};
            }

            // if max element is lesser than next rows same column element, will move startRow to the next row
            if (arr[middleRow][rowMax] < arr[middleRow + 1][rowMax]) {
                startRow = middleRow + 1;
            }
            else  {
                endRow = middleRow - 1;
            }
        }

        // if we did not find peak element int matrix
        return new int[] { -1, -1};
    }

    public static int maxRowElementPosition(int[] arr, int end) {
        int max = 0;
        for(int i = 0; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
