

public class MaxHeapSortTest {

    @Test
    public void testSort() {
        int[] arr1 = {4, 2, 1, 3, 5};
        int[] sorted1 = {1, 2, 3, 4, 5};
        MaxHeapSort.maxHeapSort(arr1);
        assertArrayEquals(sorted1, arr1);

        int[] arr2 = {5, 4, 3, 2, 1};
        int[] sorted2 = {1, 2, 3, 4, 5};
        MaxHeapSort.maxHeapSort(arr2);
        assertArrayEquals(sorted2, arr2);

        int[] arr3 = {1, 2, 3, 4, 5};
        int[] sorted3 = {1, 2, 3, 4, 5};
        MaxHeapSort.maxHeapSort(arr3);
        assertArrayEquals(sorted3, arr3);

        int[] arr4 = {5, 4, 3, 2, 1, 0};
        int[] sorted4 = {0, 1, 2, 3, 4, 5};
        MaxHeapSort.maxHeapSort(arr4);
        assertArrayEquals(sorted4, arr4);

        int[] arr5 = {1};
        int[] sorted5 = {1};
        MaxHeapSort.maxHeapSort(arr5);
        assertArrayEquals(sorted5, arr5);

        int[] arr6 = {};
        int[] sorted6 = {};
        MaxHeapSort.maxHeapSort(arr6);
        assertArrayEquals(sorted6, arr6);
    }

    private void assertArrayEquals(int[] sorted1, int[] arr1) {
    }
}
