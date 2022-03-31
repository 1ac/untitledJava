package Part1.Charpter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Читает вводимые пользователм строки, кодирует их
 * при помощи тривиального подстановочного шифра Rot13
 */

public class Rot13Input {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(;;) {
            System.out.println("> ");
            String line = in.readLine();
            if ((line == null) || line.equals("q")) break;
            StringBuffer buf = new StringBuffer(line);
            for (int i = 0; i < buf.length(); i++) buf.setCharAt(i, rot13(buf.charAt(i)));
            System.out.println(buf);
        }

    }

    /**
     * Этот метод осуществляет подстановочное шифрование Rot13
     * Он сдвигает по кругу каждую букву алфавита на 13 мест
     */
    public static char rot13(char c) {
        if ((c >= 'A') && (c <= 'Z')) {
            c +=13;
            if(c > 'Z') c -= 26;
        }
        if ((c >= 'a') && (c <= 'z')) {
            c += 13;
            if (c>'z') c -= 26;
        }
        return c;
    }
}
