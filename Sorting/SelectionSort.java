public class SelectionSort {

    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public void swap(int[] arr,int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    public static void main(String[] args) {

        int[] arr = {5, 95, 5, 95, 8, 6, 52};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);
    }
}
