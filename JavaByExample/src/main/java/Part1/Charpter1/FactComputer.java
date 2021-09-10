package Part1.Charpter1;

/**
 * Вычисление и отображение факториала числа,
 * заданого через аргументы.
 */

public class FactComputer {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            System.out.println(x + "! = " + Factorial4.factoria(x));
        }
        //пользователь забыл задать аргумент
        //Исключение возникает если args[0] остается неопределенным.
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы должны задать аргумент");
            System.out.println("Формат: java FactComputer <число>");
        }
        // Аргумент не является числом. Выдается методом Integer.parseInt()
        catch (NumberFormatException e) {
            System.out.println("Задаваемый аргумент должен быть целым числом");
        }
        //Аргумент < 0 Ввыдается методом Factorial4.factorial()
        catch (IllegalArgumentException e) {
            System.out.println("Плохой аргумент: " + e.getMessage());
        }
    }
}
