package Part1.Charpter1;

import java.math.BigInteger;
import java.util.ArrayList;


/**
 * Применяются целые числа произвоьно большого размера, поэтому вычисляемые значения не ограничены сверху.
 * Для кэширования вычисленных значений в ней применяется объект ArrayList вместо масиивов фиксированного размера.
 * ArrayList похож на масив, но может разрастаться до любовго размера. Метод factorial() объявлен как "synchronized",
 * поэтому можно смело использовать в многопоточных программах
 */

public class Factorial4 {
    protected static ArrayList table = new ArrayList(); // создаем переменную для кэш
    static {
        // Первый элемент кэша инициализируется значением 0! = 1;
        table.add(BigInteger.valueOf(1));
    }

    public static synchronized BigInteger factoria(int x) {
        if (x < 0) throw new IllegalArgumentException("x должен быть неотрицательным.");
        for (int size = table.size(); size <= x; size++ ) {
            BigInteger lastfact = (BigInteger)table.get(size-1);
            BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size)) ;
            table.add(nextfact);
        }
        return (BigInteger) table.get(x);
    }

    public static void main(String[] args) {
        for (int i =0; i <= 5000; i++) {
            System.out.println(i + "! = " + factoria(i));
        }
    }
}