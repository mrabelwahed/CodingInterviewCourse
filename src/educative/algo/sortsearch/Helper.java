package educative.algo.sortsearch;

class Helper {
    static void printArray(int[] arr, int arrSize) {
        for (int i = 0; i < arrSize; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static int findMin(int[] arr, int start, int end) {
        if (end <= 0 || start < 0)
            return 0;

        int minInd = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[minInd] > arr[i])
                minInd = i;
        }
        return minInd;
    }
    int findMax(int[] arr, int start, int end) {
        if (end <= 0 || start < 0)
            return 0;

        int maxInd = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[maxInd] < arr[i])
                maxInd = i;
        }
        return maxInd;
    }
}

/** notes
 * this algorithm devides the array into two parts sorted & unsorted
 * after that it keeps search for min element in the array
 * and swap it with ith element in the array
 *Time complexity #
 * The time complexity of this code is in O(n^2)
 * O(n​2) because findMin() iterates over the entire array for each element of the given array.
 * The quadratic time complexity makes it impractical for large inputs.
 */
