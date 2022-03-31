package Part1.Charpter1;

/**
 * Вычисление факториала
 * По формуле n! = n * (n-1)!
 */


public class Factorial2 {
    public static long factorial(long x) {
        if (x < 0 ) throw new IllegalArgumentException("x должен быть >= 0");
        if (x <= 1) return 1;
        else
            return x*factorial(x-1);
    }
}