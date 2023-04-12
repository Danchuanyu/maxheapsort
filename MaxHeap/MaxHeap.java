public class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IllegalStateException();
        }

        heap[size] = value;

        heapifyUp(size);

        size++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        int root = heap[0];
        heap[0] = heap[size - 1];

        size--;

        heapifyDown(0);

        return root;
    }

    private void heapifyUp(int index) {
        int parent = (index - 1) / 2;

        if (index > 0 && heap[index] > heap[parent]) {
            swap(index, parent);
            heapifyUp(parent);
        }
    }

    private void heapifyDown(int index) {
        int largerChild;
        int leftChild = index * 2 + 1;
        int rightChild = index * 2 + 2;

        if (leftChild >= size) {
            return;
        } else if (rightChild >= size) {
            largerChild = leftChild;
        } else {
            largerChild = (heap[leftChild] > heap[rightChild]) ? leftChild : rightChild;
        }

        if (heap[index] < heap[largerChild]) {
            swap(index, largerChild);
            heapifyDown(largerChild);
        }
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }
}
