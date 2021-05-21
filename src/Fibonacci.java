import java.math.BigDecimal;

/**
 * Вычисление ряда фибоначи
 * <p>
 * Числа Фибоначчи — это последовательность натуральных чисел, которая начинается с чисел ноль и один,
 * а каждое последующее число равно сумме двух предыдущих:
 */

public class Fibonacci {
    public static void main(String[] args) {


    }

    public void F2(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }

    public void F1(int n) {
        int n0 = 0;
        int n1 = 1;
        int n2;

        for (int i = 1; i <= 5; i++ ) {
            n2 = n0 + n1;
            System.out.println("n2");
            n0 = n1;
            n1 = n2;
        }
    }
}
