package com.com.chapter2;

/**
 * Класс представляет комплексные числа и опредляет методы, реализующие 
 * арифметику комплексных чисел
 */

public class ComplexNumber {
    // Это переменные экземпляра. Каждый объект класса ComplexNumber содержит
    // Два значения типа double, обозначаемые х и у. Они описаны как privat  и, значит
    // недоступны извне этого класса. Доступ к ним осуществляется
    // посредством описанных ниже методов real() и imaginary()

    private double x, y;

    /** Это конструктор. Он инициализирует переменные x и y */
    public ComplexNumber(double real, double imaginary) {
        this.x = real;
        this.y = imaginary;
    }

    /**
     * Метод доступа. Возвращает действительную часть комплексного числа.
     * Обратите внимание на отсуствие метода setReal() для установки действительной части числа.
     * Это означает, что класс  ComplexNumber является "неизменяемым"
     */
    public double real() { return x; }

    /** Метод доступа. Возвращает мнимую часть комплексного числа */
    public double imaginary() { return y;}

    /** вычисляет абсолютную величину комплексного числа */
    public double magnitude() { return Math.sqrt(x*x + y*y); }

    /**
     * Этот метод преобразует ComplexNumber в строку. Это метод класса Object,
     * Который мы замещаем так, чтобы комплексные числа можно было осмысленно
     * преобразовать в строки, которые  удобно выводить посредства метода
     * System.out.print() и подобных ему
     */
    public String toString() { return "{" + x + "," + y +"}"; }

    /**
     * Это статический метод класса. Он берет два косплексных числа, складывает
     * их и возвращает результат в виде третьего числа. Поскольку метод статистический, для него не существует "текущий экземпляр"
     * или объект this. Применяется он так ComplexNumber c = ComplexNumber.add(a,b);
     */
    public static ComplexNumber add (ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.x + b.x, a.y + b.y);
    }

    /**
     * Это нестатистичесмкий метод эксземпляра с тем именем. Он прибавляет
     * заданное косплексное число к текущему комлексному числу. Применяется так
     * ComplexNumber c = a.add();
     */
    public ComplexNumber add(ComplexNumber a) {
        return new ComplexNumber(this.x + a.x, this.y + a.y);
    }

    /** Статистический метод класса для умножения косплексных чисел */
    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.x*b.x - a.y*b.y, a.x*b.y + a.y*b.x);
    }

    public ComplexNumber multiply(ComplexNumber a) {
        return new ComplexNumber(x*a.x - y*a.y, x*a.y + x*a.x);
    }
}

