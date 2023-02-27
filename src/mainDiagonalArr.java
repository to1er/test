public class mainDiagonalArr {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 3, 6},
                {4, 8, 7},
                {1, 2, 1}
        };
        // (0, 2), (1, 1), (0, 0)
        getSumDiagonalArr(arr);
        getSumSecondDiagonal(arr);
    }
    public static int getSumDiagonalArr(int[][] arr) {
        int sumMainDiagonalArr = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] ints = arr[i];
            for (int j = 0; j < ints.length; j++) {
                if (j == i) {
                    sumMainDiagonalArr = sumMainDiagonalArr + ints[j];
                }
            }
        }
        System.out.print(sumMainDiagonalArr + " ");
        return sumMainDiagonalArr;
    }
    public static int getSumSecondDiagonal(int[][] arr) {
        int sumSecondDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] ints = arr[i];
            for (int j = 0; j < ints.length; j++) {
                if(i + j == ints.length - 1)
                    sumSecondDiagonal = sumSecondDiagonal + ints[j];
            }
        }
        System.out.print(sumSecondDiagonal);
        return  sumSecondDiagonal;
    }
}