package com.com.chapter2;

/**
 * Это подкалсс класса Rect, позволяющий нарисовать его на экране.
 * Он наследует все полня и методы класса Rect
 * Для рисования он использует объект класса java.awt.Graphics
 */

public class DrawableRect extends Rect {
    /** Конструктор DrawableRect просто вызывает конструтор Rect() */
    public DrawableRect(int x1, int y1, int x2, int y2) {super(x1,y1,y2,x2);}

    /** Это новый метод, определяемый в классе DrawableRect */
    public void draw(java.awt.Graphics g) {
        g.drawRect(x1, y1, (x2 - x1), (y2 - y1));
    }

}
