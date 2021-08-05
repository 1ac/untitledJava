package Part1.Charpter1;

/**
 * Программа FizzBuzz считает до 100, заменяя каждое число, кратное 5, словом fizz,
 * каждое число, кратное 7, - словом buzz
 * кратное 35 словом fizzbuzz
 *
 */


public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 1; i<= 100; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0)) System.out.print("fizzbuzz");
            else if ((i % 5) == 0) System.out.print("fizz");
            else if ((i % 7) == 0) System.out.print("buzz");
            else System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

    }
}
