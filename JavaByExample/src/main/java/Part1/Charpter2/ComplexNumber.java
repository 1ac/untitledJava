package Part1.Charpter2;

/**
 * Класс представляет комплексные числа и определяет методы, реализующие
 * арифметику комплексных чисел
 */

public class ComplexNumber {
    /**
     * Переменная экземпляра.
     * Каждый объект класса ComplexNumber содержит два значения типа double
     * Они описаны как private и недоступны извне этого класса
     * Доступ к ним осуществляется посредством методов real() imaginary()
     */

    private double x, y;

    //Это конструктор он инициализирует перменные x и y
    public ComplexNumber(double real, double imaginary) {
        this.x = real;
        this.y = imaginary;
    }

    /**
     * Метод достпа. Возвращает действительную часть комплексного числа.
     * Отсутсвие метода setReal() означает что класс ComplexNumber является "ytbpvtyztvsv"
     */

    public double real() {
        return x;
    }

    // вычисление абсолютной величины комплексного числа
    public double imaginary() {
        return Math.sqrt(x * x + y * y);
    }

    // Преобразование ComplexNumber в строку
    public String toString() {
        return "{" + x + "," + y + "}";
    }

    // Для статического метода не существует "текущий экземпляр" или объект this
    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.x + b.x, a.y + b.y);
    }

    public ComplexNumber add(ComplexNumber a) {
        return new ComplexNumber(this.x + a.x, this.y+a.y);
    }
}
