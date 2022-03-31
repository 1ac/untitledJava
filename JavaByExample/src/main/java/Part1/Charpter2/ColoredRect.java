package Part1.Charpter2;


import java.awt.*;

/**
 * Подкласс DrawableRect добавляет цвета изображаемого прямоугольника
 */

public class ColoredRect extends DrawableRect {
    //Это новые поля, определяемые этим классом
    //Поля x1 y1 x2 y2 наследуются от базового класса Rect
    protected Color border, fill;

    /**
     * Конструктор использует super() для вызова конструктора базового класса и сам тоже производит
     * некую инициализацию
     */
    public ColoredRect(int x1, int y1, int x2, int y2,
                       Color border, Color fill) {
        super(x1, y1, x2, y2);
        this.border = border;
        this.fill = fill;
    }

    /**
     * Этот метод замещает метод draw() нашего базового класса так, чтобы
     * он мог воспользоваться заданными цветами
     */

    public void draw(Graphics g) {
        g.setColor(fill);
        g.fillRect(x1, y1, (x2 - x1), (y2 - y1));
        g.setColor(border);
        g.drawRect(x1,y1,(x2-x1),(y2-y1));
    }

}
