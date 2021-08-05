package Part1.Charpter1;

/**
 * Прогграма расчитывает первые 20 чисел Фибоначи
 * Каждый его элемент формируется как сумма двух предыдущих элеметнотов ряда
 * начиная с элементов 1 и 1
 */

public class Fibonacci {
    public static void main(String[] args) {
        int n0 = 1, n1 =1, n2;
        System.out.println(n0 + "  " + n1 + " ");
        for(int i=0; i<18; i++) {
            n2 = n1 + n0;
            System.out.println(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
}
