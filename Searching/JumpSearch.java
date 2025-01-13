public class JumpSearch {

    public int jumpSearch(int[] arr, int n) {

        int size = arr.length;
        int jump = (int) Math.sqrt(size);
        for (int i = 0; i < arr.length; i = i + jump) {
            if (arr.length < i + jump && arr[i] >= n) {
                return linearSearch(arr, n, i, i + jump);
            } else return linearSearch(arr, n, i, size - 1);
        }
        return -1;
    }

    public int linearSearch(int[] arr, int n, int start, int end) {

        for (int i = start; i <= end; i++) {
            if (arr[i] == n) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // sorted array
        int[] arr = {5, 9, 21, 36, 45, 65, 78, 94};

        JumpSearch jumpSearch = new JumpSearch();
        System.out.println(jumpSearch.jumpSearch(arr, 6));
    }
}
