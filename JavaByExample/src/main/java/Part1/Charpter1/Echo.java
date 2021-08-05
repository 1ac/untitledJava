package Part1.Charpter1;

/**
 * Программа распечатывает все заданные в ее командной строке аргументы
 */

public class Echo {
    public static void main(String[] args) {
        int i =0;
        while (i< args.length) {
            System.out.println(args[i] + " ");
            i++;
        }

    }
}
