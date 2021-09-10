package Part1.Charpter1;
import java.io.*;

/**
 * Отображение факториалы чисел, вводимых пользователм в интерактивном режиме
 */

public class FactQuoter {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // Бесконечный цикл
        for(;;) {
            //Отображение подсказки для пользователей
            System.out.println("FactQuoter> ");
            //Считывается введенная пользователем строка
            String line =  in.readLine();
            //Если считан конец файла,
            //или пользователь набрал quit то конец
            if ((line == null) || line.equals("quit") || line.equals("q")) break;
            //Пытаемся проанализировать строку, вычислить и напечатать факториал
            try {
                int x = Integer.parseInt(line);
                System.out.println(x + "! = " + Factorial4.factoria(x));
            }
            //Если что то не в порядке, отображается общее сообщение об ошибке
            catch (Exception e) {
                System.out.println("Invalid Input");
            }
        }


    }
}
