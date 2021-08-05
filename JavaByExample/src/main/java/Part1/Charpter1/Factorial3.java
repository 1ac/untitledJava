package Part1.Charpter1;

/**
 * Вычисляет факториал и кэширует результаты в таблице
 * 20! - самый большой факториал для типа long
 * поэтому проверим арумент и выдадим исключение
 */

public class Factorial3 {
    static long[] table = new long[21];
    static { table[0] = 1; }
    static int last = 0;
    public static long factorial(int x) throws IllegalArgumentException {
        if (x>=table.length)
            if (x<0) throw new IllegalArgumentException("x должен быть не отрицательным");
            while(last < x) {
                table[last + 1] = table[last] * (last + 1);
                last++;
            }
            return table[x];
    }

}
