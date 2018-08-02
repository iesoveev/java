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
}
