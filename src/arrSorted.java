public class arrSorted {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 7};
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
            System.out.println(arr);
        }

    }
}
