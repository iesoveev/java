import java.util.Objects;

public class JavaMethods {

    int s;

    public JavaMethods(int name) {
        this.s = name;
    }

    // Числа фибоначчи. Динамическое программирование
    public int fiboDynamicTD(int[] arr, int n) {
        if (arr[n] == -1) {
            if (n <= 1) {
                arr[n] = n;
            } else {
                arr[n] = fiboDynamicTD(arr, n-1) + fiboDynamicTD(arr, n-2);
            }

        }
        return arr[n];
    }
    // Числа фибоначчи рекурсивно (плохой метод)
    public int fiboBad(int n) {
        if (n <= 1) return n;
        return fiboBad(n-1) + fiboBad(n-2);
    }

    //числа фибоначчи через массив
    public int fibo(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
    // числа фибоначчи. Элегантное решение (без массива и рекурсии)
    public int fiboFibo(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }


    //Наибольший общий делитель (Евклид)
    public int nod(int a, int b) {
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        while (true) {
            try {
                if (arr[0] >= arr[1]) {  // заменяем большее число на остаток от деления большего на меньшее
                    arr[0] %= arr[1];
                } else {
                    arr[1] %= arr[0];
                }
            } catch (ArithmeticException e) {

            }
            if (arr[0] == 0) return arr[1]; // условие выхода из цикла
            if (arr[1] == 0) return arr[0];
        }
    }
    // Бинарный поиск индекса элемента в массиве
    public int binarySearch(int[] arr, int key) {
        int l = 0;
        int r = arr.length;
        while (r >= l) { // пока между точками есть хотя бы 1 элемент
            int m = (l + r) / 2; // на каждой итерации обновляем центр массива
            if (key == arr[m]) return m; // если ключ равен элементу массива, то радуемся
            if (key > arr[m]) { // если ключ правее центра, то смещаем левый конец отрезка к центру
                l = m + 1;
            } else {
                r = m - 1; // если ключ левее
            }
        }
        return -1;
    }


}

