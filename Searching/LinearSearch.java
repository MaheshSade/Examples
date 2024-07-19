public class LinearSearch {

    // Iterating each element
    public int linearSearch(int[] arr, int n) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] arr = {4, 85, 2, 45, 21, 35, 65};

        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.linearSearch(arr, 65));
    }
}
