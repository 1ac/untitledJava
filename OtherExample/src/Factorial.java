import static com.com.Factorial.factorial;
import static com.com.Factorial2.factorial2;
import static com.com.Factorial3.factorial3;
import static com.com.Factorial4.factorial4;

import java.util.*;
import java.math.BigInteger;

/**
 *
 */


public class Factorial {
    public static int factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("х должен быть >= 0");
        int fact = 1;
        for (int i = 2; i <= x; i++) //цикл
            fact *= i;
        return fact;
    }
}

class Factorial2 {

    public static int factorial2(int x) {
        if (x < 0) throw new IllegalArgumentException("x должен быть >= 0");

        if (x <= 1) return 1;                   // здесь рекурсия прекращается
        else return x * factorial2(x - 1);  // шаг рекурсии - вызов самого себя
    }
}

/**
 * Класс вычисляет факториал и кэширует резульаты в таблица для дальшнейшего употребления.
 * 20! - самый большой факториал который подходит под тип long
 * поэтому проверим аргумент и выдадим сключение если аргумент окажется слишком большим или слишком маленьким
 */

class Factorial3 {

    static long[] table = new long[21]; // создаем массив для хранения факториалов от 0! до 20!
    static { table[0] = 1; } // "Статический инициализатор": инициализурем первый элемент массива
    static int last = 0;  // запоминаем номер последнего вычисленнного факториала

    public static long factorial3 (int x) throws IllegalArgumentException {
        if (x >= table.length) throw new IllegalArgumentException("переполнение, х слишком велик");
        if(x<0) throw new IllegalArgumentException("х должен быть не отрицательным");

        while(last < x) {
            table[last+1] =  table[last] * (last + 1);
            last++;

        }
        return table[x];
    }
}


/**
 * В этой реализации применяют целые числа произвольно большого размера, поэтому вычисляемые значения не ограничены сверху.
 * Для кэширования приминяется объект ArrayList вместо массивов фиксированного размера
 * ArrayList похож на массив, но может разрастаться до любого размера
 * Метод factorial() объявлен как synchronized поэтому его можно смело использовать в многопоточных программах
 */

class Factorial4 {
    protected static ArrayList table = new ArrayList(); // создаем кэш
    static { // Первый элемент кэша инициализуется значением 0! = 1
        table.add(BigInteger.valueOf(1));
    }

    /** Метод factorial4(), использующий объекты BigInteger сохраняемые в ArrayList */
    public static synchronized BigInteger factorial4(int x) {
        if(x < 0) throw new IllegalArgumentException("х должен быть не отрицательным.");

        for(int size = table.size(); size <= x; size++ ) {
            BigInteger lastfact = (BigInteger)table.get(size-1);
            BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size));
            table.add(nextfact);
        }
        return (BigInteger) table.get(x);
    }

}


class FactorialExample {
    public static void main(String args[]) {

        System.out.println(factorial(5));
        System.out.println(factorial2(5));

//        System.out.println(factorial3(-1));
//        System.out.println(factorial3(21));
        System.out.println(factorial3(19));

        for(int i = 0; i <= 50; i++) System.out.println(i + "! = " + factorial4(i));

    }
}
