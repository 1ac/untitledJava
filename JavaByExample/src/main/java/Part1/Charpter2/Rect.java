package Part1.Charpter2;

/**
 * Этот класс представяле прямоугольник. Его поля представляют координаты
 * углов этого прямоугольника. Его методы определяют операции, которые
 * могут осущствяться с объектами Rect
 */

public class Rect {
    //Поля данных класса
    public int x1, y1, x2, y2;

    /**
     * Метод rect - главный конструктор класса. Использует свои
     * аргументы для инициализации полей нового объекта. Обратите внимание
     * на то, что его имя совпадает с именем класса и что в его сигнатуре
     * нет возвращаемого значения
     */
    public Rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    /**
     * Еще один конструтор. Он определяется через предыдущий конструтор
     */
    public Rect(int width, int height) {
        this(0, 0, width, height);
    }

    /**
     * это еще один конструтор
     */
    public Rect() {
        this(0, 0, 0, 0);
    }

    /**
     * Перемещение прямоугольника на указанные расстояния
     */
    public void move(int deltax, int deltay) {
        x1 += deltax;
        x2 += deltax;
        y1 += deltay;
        y2 += deltay;
    }

    /**
     * Проверяем, находится ли заданная точка внутри прямоугольника
     */
    public boolean isInside(int x, int y) {
        return ((x >= x1) && (x <= x2) && (y >= y1) && (y <= y2));
    }

    /**
     * Возвращается объединение этого прямоугольника с другим. Другими словами возвращается
     * наименьший прямоугольник, содержащий оба прямоугольника
     */
    public Rect union(Rect r) {
        return new Rect((this.x1 < r.x1) ? this.x1 : r.x1,
                (this.x2 < r.x2) ? this.x2 : r.x2,
                (this.y1 < r.y1) ? this.y1 : r.y1,
                (this.y2 < r.y2) ? this.y2 : r.y2);
    }

    /**
     * Возвращается пересечение этого прямоугольника с другим.
     * Возвращает область их наложения.
     */
    public Rect intersection(Rect r) {
        Rect result = new Rect((this.x1 < r.x1) ? this.x1 : r.x1,
                (this.x2 < r.x2) ? this.x2 : r.x2,
                (this.y1 < r.y1) ? this.y1 : r.y1,
                (this.y2 < r.y2) ? this.y2 : r.y2);
        if (result.x1 > result.x2) {
            result.x1 = result.x2 = 0;
        }
        if (result.y1 > result.y2) {
            result.y1 = result.y2 = 0;
        }
        return result;
    }

    /**
     * Метод нашего базового класса Object. Мы замещаем его так, чтобы объекты класса Rect
     * можно было осмысленно преобразовывать в строки, складывать с другими строками при помощи оператор +
     * и передавать таким методам, как System.out.println().
     */
    public String toString() {
        return "[" + x1 + "," + y1 + ": " + x2 + "," + y2 + "]";
    }

}
