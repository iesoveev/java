import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {


    public int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];


        int i = 0;
        int j = 0;

        for (int k = 0; k < result.length; k++) {
            if (i > arr1.length - 1) {
                result[k] = arr2[j];
                j++;
            } else if (j > arr2.length - 1) {
                result[k] = arr1[i];
                i++;
            } else if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
        }
        return result;
    }


    public int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;
        int n = arr.length;
        int m = n / 2;
        int[] left = new int[m];
        int[] right = new int[n - m];
        System.arraycopy(arr, 0, left, 0, m);
        System.arraycopy(arr, m, right, 0, n - m);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }


}