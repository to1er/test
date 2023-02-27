

import java.util. Scanner;
public class test {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 8, 9, 6};
        findSumBetween(arr);

    }
    public static void  printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void arrSorted(int[] arr){
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        printArr(arr);
    }
    public static int getMinIndex(int[] arr){
        int minIndex = 0;
        int value = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < value){
                value = arr[i];
                minIndex = i;
            }

        }
        System.out.println(minIndex);
        return minIndex;
    }
    public static int getMaxIndex(int[] arr){
        int maxIndex = 0;
        int value = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > value){
                value = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
        return maxIndex;
    }
    public static int findSumBetween(int[] arr){
        int sum = 0;
        int minIndex = getMinIndex(arr);
        int maxIndex = getMaxIndex(arr);
        if(minIndex > maxIndex){
            int temp = maxIndex;
            maxIndex = minIndex;
            minIndex = temp;
        }
        for (int i = minIndex + 1; i < maxIndex; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        return sum;

    }
}
