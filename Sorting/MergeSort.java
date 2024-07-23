public class MergeSort {

    public void divide(int[] arr,int low,int high) {
        int mid = low + (high-low)/2;
        if (low>=high){
            return;
        }
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,high,mid);
    }

    public void merge(int[] arr, int low, int high, int mid) {
        int index1 = low;
        int index2 = mid+1;
        int x = 0;
        int[] merger = new int[high-low+1];

        while (index1<=mid && index2<=high ){
            if (arr[index1] <= arr[index2]) {
                merger[x++] = arr[index1++];
            }else {
                merger[x++] = arr[index2++];
            }
        }

        while (index1<=mid){
            merger[x++] = arr[index1++];
        }
        while (index2<=high){
            merger[x++] = arr[index2++];
        }

        for (int i = low, j=0; i <=high; i++,j++) {
            arr[i] = merger[j];
        }
    }

    public static void main(String[] args) {

        int[] arr = {4,1,6,4,3,9,2};

        MergeSort mergeSort = new MergeSort();
        mergeSort.divide(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
