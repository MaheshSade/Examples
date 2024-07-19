public class ExponentialSearch {

    public int exponentialSearch(int[] arr, int n) {

        if (arr[arr.length - 1] < n) {
            return -1;
        }
        int i = 1;
        while (i < arr.length && arr[i] < n) {
            i = i * 2;
        }

        if (i < arr.length && arr[i] >= n) {
            return binarySearch(arr, n, i / 2, i);
        } else {
            return binarySearch(arr, n, i/2, arr.length - 1);
        }
    }

    public int binarySearch(int[] arr, int n, int low, int high) {

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == n) {
                return mid;
            }
            if (arr[mid] < n) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 12, 42, 68, 69, 99};

        ExponentialSearch exponentialSearch = new ExponentialSearch();
        System.out.println(exponentialSearch.exponentialSearch(arr, 99));
    }
}
