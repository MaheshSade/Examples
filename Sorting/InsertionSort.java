public class InsertionSort {

    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;

            }
                arr[j+1] = temp;

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {

        int[] arr = {8, 1, 55, 47, 2, 96, 88, 1, 5};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);
    }
}
