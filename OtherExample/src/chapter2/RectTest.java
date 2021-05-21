package com.com.chapter2;

/**
 * Класс демонстрации возможности применения класса Rect
 */

public class RectTest {
    public static void main(String args[]) {
        Rect r1 = new Rect(1, 1,4, 4);
        Rect r2 = new Rect(2, 3,5, 6);

        Rect u = r1.union(r2);
        Rect i = r2.intersection(r1);

        if (u.isIndisde(r2.x1, r2.y1)) // Используем поля Rect и вызываем метод
            System.out.println("(" + r2.x1 + "," + r2.y1 + ") содержитвся в объединении");

        DrawableRect r3 = new DrawableRect(1,1,4,4);
//        r3.draw(1);


        // Следующие строки неявно вызвают метод Rect.toString()
        System.out.println(r1 + " union "+ r2 + " = " + u);
        System.out.println(r1 + " intersect "+ r2 + " = " + i);
    }
}
