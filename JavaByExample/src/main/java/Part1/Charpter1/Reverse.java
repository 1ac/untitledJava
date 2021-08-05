package Part1.Charpter1;

/**
 * Программа выводит "От конца к началу" аргументы
 */

public class Reverse {
    public static void main(String[] args) {
        for (int i = args.length-1; i >= -0; i--) {
            for (int j=args.length-1; j>=0; j--) {
                System.out.println(args[i].charAt(j));
            }
            System.out.println(" ");
        }
        System.out.println();
    }
}
