public class BubbleSort {


    public void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }


    public static void main(String[] args) {

        int[] arr = {8, 4, 5, 62, 41, 6, 3, 14, 74};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
    }
}
