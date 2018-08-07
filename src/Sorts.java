public class Sorts {
    public int[] insertSort(int[] arr) { // Идея в том, что есть отсортированная часть, а есть неотсортиованная. По одному элементу мы перегоняем из неотс в отсорт.
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0) {
                if (arr[j] < arr[j-1]) {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                    j -= 1;
                } else break;
            }
        }
        return arr;
    }

    public int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0;  j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
