import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 45;
        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        long startTime = System.currentTimeMillis();
        System.out.println(new JavaMethods().fiboFibo(45));
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");



    }
}
