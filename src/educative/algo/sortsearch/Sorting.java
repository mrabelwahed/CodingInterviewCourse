package educative.algo.sortsearch;

public class Sorting {
    static Helper helper = new Helper();
    public static void main(String[] args) {
        int arr[] = {5,4,1,0,5,95,4,-100,200,0};
        int arrSize = 10;
        selectionSort(arr, arrSize);
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
}
