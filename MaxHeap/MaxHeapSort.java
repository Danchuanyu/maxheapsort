import java.util.Arrays;

public class MaxHeapSort {
    public static void maxHeapSort(int[] arr) {
        MaxHeap heap = new MaxHeap(arr.length);

        for (int i = 0; i < arr.length; i++) {
            heap.insert(arr[i]);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = heap.remove();
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 5};
        MaxHeapSort.maxHeapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
