package com.com.chapter1;

/**
 * программа распечатывает 20 первых рядов Фибоначчи
 * каждый его элемент формируется как сумма двух предлыдущих элементов ряда
 * начиная с элементов 1 и 1
 * 1 + 1 + 2 + 3 + 5 + 8 + 13 итд
 *
 *
 *
 */

public class Fibbonachi3 {
    public static void main(String args[]) {

        int n0 =1, n1 = 1, n2 = 1, n3;

        for (int i = 1; i <= 20; i++) {
            n3 = n0 + n1 + n2;
            System.out.print(i + ": " + n0 + " + " + n1 + " + " +  n2 + " = ");
            System.out.println(n3);
            n0 = n1;
            n1 = n2;
            n2 = n3;

        }
        System.out.println();
    }
}

// 1 1 1 3 5 9