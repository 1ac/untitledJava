package Part1.Charpter5;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Класс отображающий информацию о  URL
 */

public class GetURLInfo {
    /** Применяем класс для получения информации о URL */
    public static void printinfo(URL url) throws IOException {
        URLConnection c = url.openConnection(); // Получаем объект URLConnection из объекта URL
        c.connect(); //Создаем подключение к URL
        System.out.println("getContentType: "  + c.getContentType());
        System.out.println(c.getContentEncoding());
        System.out.println(c.getContentLength());
        System.out.println(c.getDate());
        System.out.println(c.getLastModified());
        System.out.println(c.getExpiration());
        if(c instanceof HttpURLConnection) {
            HttpURLConnection h = (HttpURLConnection) c;
            System.out.println(h.getRequestMethod());
            System.out.println(h.getResponseMessage());
            System.out.println(h.getResponseCode());
        }
    }

    public static void main(String[] args) {
        try { printinfo(new URL("https://google.com")); }
        catch (Exception e) {
            System.out.println(e);
            System.err.println("java GetURLINFO <url>");
        }
    }
}
