package Part1.Charpter1;

/**
 * Факториал целого числа получается как произведение этого числа на все положительные целые ,
 * которые меньше него. Таким образом, факториал 5 (записывается 5!) -
 * это произведение 5*4*3*2*1 или 120
 */

class exFactorial {
    public static int factorial(int x) throws IllegalAccessException {
        if (x < 0) throw new IllegalAccessException("x должен быть >= 0");
        int fact = 1;
        for (int i = 2; i <= x; i++)
            fact *= i;
        return fact;
    }
}
public class Factorial {
    public static void main(String[] args) throws IllegalAccessException {
        int fact = exFactorial.factorial(6);
        System.out.println(fact);


    }
}