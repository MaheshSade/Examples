public class InterpolationSearch {

    public int interpolationSearch(int[] arr, int n) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) * (n - arr[start])/ (arr[end] - arr[start]));

            if (arr[mid] == n) {
                return mid;
            }

            if (arr[mid] > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public int recursion(int[] arr, int n,int start,int end) {

        if (start >= end && start!=end){
            return -1;
        }

         int mid = start + ((end - start) * (n - arr[start])/ (arr[end] - arr[start]));

            if (arr[mid] == n) {
                return mid;
            }

            if (arr[mid] >= n) {
                return recursion(arr,n,start,mid - 1);
            } else {
                return recursion(arr,n,mid + 1,end);
            }

    }

    public static void main(String[] args) {

        //sorted array
        int[] arr = {4, 8, 9, 22, 45, 88, 112, 201, 263};

        InterpolationSearch interpolationSearch = new InterpolationSearch();
        System.out.println(interpolationSearch.interpolationSearch(arr, 0));

        int start = 0;
        int end = arr.length - 1;
        System.out.println(interpolationSearch.recursion(arr, 263,start,end));
    }

}
