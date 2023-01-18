package _3DesignPatterns.ch2;

public class MergeSort implements SortingStrategy {
    public static void merge(Integer[] list, Integer[] left, Integer[] right, int ln, int rn) {
        int i = 0, j = 0, k = 0;
        while (i < ln && j < rn) {
            if (left[i] <= right[j]) {
                list[k++] = left[i++];
            } else {
                list[k++] = right[j++];
            }
        }
        while(i < ln) {
            list[k++] = left[i++];
        }
        while (j < rn) {
            list[k++] = right[j++];
        }
    }

    public static void mergeSort(Integer[] list, int n) {
        if (list.length < 2) {
            return;
        }

        int mid = list.length / 2;
        Integer[] left = new Integer[mid];
        Integer[] right = new Integer[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = list[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = list[i];
        }

        mergeSort(left, mid);
        mergeSort(right, n - mid);

        merge(list, left, right, mid, n - mid);
    }

    @Override
    public void sort(Integer[] list) {
        mergeSort(list, list.length);
    }
}