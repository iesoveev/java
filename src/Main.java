import java.io.*;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{2, 3, 6, 10, 13, 22, 31, 310};
        int[] arr1 = new int[]{1, 4, 5, 6, 7, 8, 9 ,21};
        System.out.println(Arrays.toString(new MergeSort().merge(arr, arr1)));



    }
}