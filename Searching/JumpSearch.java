public class JumpSearch {

    public int jumpSearch(int[] arr, int n) {

        int jump = (int) Math.sqrt(arr.length);
        for (int i = 0; i < arr.length; i = i + jump) {
            if (arr[i] >= n) {
                return linearSearch(arr, n, i - jump, i);
            }
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
