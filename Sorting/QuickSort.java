public class QuickSort {

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int x = low - 1;
        int pivot = arr[high];
        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                x++;
//                    arr[i] = arr[i] + arr[x];
//                    arr[x] = arr[i] - arr[x];
//                    arr[i] = arr[i] - arr[x];

                int temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
            }
        }
        x++;
        int temp = arr[x];
        arr[x] = pivot;
        arr[high] = temp;
        return x;
    }

    public static void main(String[] args) {

        int[] arr = {8, 4, 5, 1, 4, 3, 7, 2};

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
