package com.com.chapter2;

/**
 * Класс предоставляет прямоугольник.
 * Его поля предоставляют координат ыуглов этого прямоугольника. \
 * Его методы определяют оперции, которые могут осущевтляться с объектами Rect
 */
public class Rect {
    public int x1, y1, x2, y2;

    /**
     * Метод Rect  - главный конструктор класса. Он просто исползует свои аргументы для инициализации полей нового объекта. Обратите внимание
     * На то, что его имя совпадает с именем класса и что в его сигнатуре нет возращаемого значения
     */

    public Rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    // Еще один конструктор он определяется через предыдущий конструктор

    public Rect(int width, int height) {
        this(0, 0, width, height);
    }
    // Это еще один конструтор

    public Rect() {
        this(0, 0, 0, 0);
    }

    // Перемещение прямоугольника на указанные расстояния
    public void move(int deltax, int deltay) {
        x1 += deltax;
        y1 += deltay;
        x2 += deltax;
        y2 += deltay;
    }

    // Проверяем находит ли заданная точка внутри прямоугольника
    public boolean isIndisde(int x, int y) {
        return ((x >= x1) && ( x <= x2) && ( y >= y1) && ( y <= y2) );
    }

    /**
     * Возвращает объединение этого прямоугольника с другим. Другими словами
     * Возвращается наименьший прямогульник, содержащий оба прямоугольника
     */

    public Rect union(Rect r) {
        return new Rect(
                (this.x1 < r.x1) ? this.x1 : r.x1,
                (this.y1 < r.y1) ? this.y1 : r.y1,
                (this.x2 < r.x2) ? this.x2 : r.x2,
                (this.y2 < r.y2) ? this.y2 : r.y2);
    }

    /**
     * Возвращается пересечение этого прямоугольника с другми.
     * Другими словами, возвращается область их наложения
     */
    public Rect intersection(Rect r) {
        Rect result = new Rect(
                (this.x1 > r.x1) ? this.x1 : r.x1,
                (this.y1 > r.y1) ? this.y1 : r.y1,
                (this.x2 > r.x2) ? this.x2 : r.x2,
                (this.y2 > r.y2) ? this.y1 : r.y2
        );
        if (result.x1 > result.x2) {result.x1 = result.x2 = 0; }
        if (result.y1 > result.y2) {result.y1 = result.y2 = 0; }
        return  result;
    }

    /**
     * Этот метод нашего базового класса Object. Мы замещаем его так, чтобы
     * Объект класса Rect можно было осмысленно преобразовывать в строки,
     * скалыдвать с другими строками при помощи оператора + и передавать
     * таким методоам как System.out.println()
     */
    public String toString() {
        return "[" + x1 + "," + x2 + "," + y1 + ","+ y2 + "]";
    }
}