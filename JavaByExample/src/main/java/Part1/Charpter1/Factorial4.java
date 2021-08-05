package Part1.Charpter1;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Импортирует классы, которые намереваемся использовать в нашей программе.
 * Применяются целые числа произвольно большого размера, поэтому вычисляемые значения не орграничены сверху.
 * Для кэширования вычесленных значений в ней приминяются объект ArraList похож на массив,
 * но может разрастаться до любовго размера. Метод factorial() объявлен
 */

public class Factorial4 {
    protected static ArrayList table = new ArrayList();
    static {
        table.add(BigInteger.valueOf(1));
    }
    public static synchronized BigInteger factorial (int x) {
        if (x<0)
    }
}
