public class MergeSort {
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < result.length; k++) {
            if (i > left.length - 1) {
                result[k] = right[j];
                j++;
            } else if (j > right.length - 1) {
                result[k] = left[i];
                i++;
            } else if (left[i] >= right[j]) {
                result[k] = right[j];
                j++;
            } else {
                result[k] = left[i];
                i++;
            }
        }
        return result;
    }

}




