public class BinarySearch {


    public int binarySearch(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;

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

    public int recursion(int[] arr, int n, int low, int high) {

        if (low >= high && low!=high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (arr[mid] == n) {
            return mid;
        }

        if (arr[mid] < n) {
            return recursion(arr, n, mid + 1, high);
        } else {
            return recursion(arr, n, low, mid - 1);
        }

    }

    public static void main(String[] args) {

        // sorted array
        int[] arr = {4, 8, 11, 21, 45, 52, 82};

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(arr, 8));

        int low = 0;
        int high = arr.length - 1;
        System.out.println(binarySearch.recursion(arr, 5, low, high));
    }
}
