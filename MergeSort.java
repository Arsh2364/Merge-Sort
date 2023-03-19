package DividenConquer;

import java.util.*;;

public class MergeSort {

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {

        int arr[] = { 6, 3, 9, 5, 2, 8, 3, 4, 55, 7, 8, 6, 4, 3, 4, 6, 7, 89, 7, 6, 4, 3, 2, 3, 5, 67, 7, 8, 6, 4, 3,
                33, 4, 4, 4, 2, 2, 43, 4, 56, 7, 8, 8, 8 };
        mergesort(arr, 0, arr.length - 1);
        printarr(arr);

    }

}
