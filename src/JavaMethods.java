public class JavaMethods {

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
