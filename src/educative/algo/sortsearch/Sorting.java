package educative.algo.sortsearch;

public class Sorting {
    static Helper helper = new Helper();
    public static void main(String[] args) {
        int arr[] = {5,4,1,0,5,95,4,-100,200,0};
        int arrSize = 10;
//        selectionSort(arr, arrSize);
         insertionSort(arr, arrSize);
         helper.printArray(arr, arrSize);
    }

    public static void selectionSort(int arr[] , int len){
        for (int i = 0; i < len; i++) {
            int minIndex = helper.findMax(arr,i,len-1);
            int tmp =  arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }

    public static void bubbleSort(int arr[] , int len){
        for (int i = 0; i < len -1 ; i++)
            // Last i elements are already in place
            for (int j = 0; j < len-i-1; j++)
                if (arr[j]>arr[j+1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
    }

    static void insertionSort(int[] arr, int len) {
        int j=0;
        for (int i = 0; i < len ; i++) {
            j=i;
                while(j>0 && arr[j]<arr[j-1]){
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
                j--;
            }

        }

    }
}

//notes
/**
 * selection sort algorithm
 * divides the array into two parts sorted & unsorted
 * after that it keeps search for min element in the array
 * and swap it with ith element in the array
 *
 * Time complexity #
 * The time complexity of this code is in O(n^2)
 * O(n​2) because findMin() iterates over the entire array for each element of the given array.
 * The quadratic time complexity makes it impractical for large inputs.
 */

/** bubble sort algorithm
 *  compares every two adjacent pairs then swap them if they are in wrong order
 *  Time complexity #
 * The time complexity of the above code is in O(n^2)
 * O(n​2). Again, this algorithm is not very efficient.
 */

/**
 * insertion sort algorithm
 * it is like when you sort your money . you pic the number that it should be sorted
 * then you should shift other money to put it at the top of the money
 * the shift process happens based on swapping
 *
 * Time complexity #
 * The algorithm is in O(n^2)
 * O(n2), which, again, makes it a poor choice for large input sizes.
 * However, notice that the complexity is actually n^2
 *
 * ​​  only when the input array is sorted in reverse. So, the ‘best-case’ complexity (when the array is already sorted in the correct order) is \Omega(n)Ω(n).
 *
 * Space complexity #
 * Also, note that all of these algorithms are in-place, hence their space complexity is in O(1).
 */
