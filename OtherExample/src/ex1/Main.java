package com.com.ex1;

public class Main {
    private static int n;

    public static void recursionFunc() {
        System.out.println("Привет рекурсия " + n);
        recursionFunc();
        n += 1;
    }

    private static int fact(int n) {
        int result = 1;
        for (int i = 1; i <=n; i++) {
            result = result * i;
        }
        return result;
    }

    private static int fact2(int n) {
        if (n < 0) {
            System.out.println("Зачем тебе факториал из отрицательного числа?");
        }

        int result = 1;
        if (n == 0) {
            return result;
        }

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;

    }

    private static int fact3(int n) {
        int result = 1;

        if (n==0) {
            System.out.print(" = ");
            return result;
        }

        if (n==1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(n);

        if (n!=2) {
            System.out.print(" * ");
        }

        result = n * fact3(n-1);
        return result;
    }

    public static void main(String[] args) {
	    System.out.println("Привет");
	    System.out.println("fact 5: " + fact(5));
	    System.out.println("\n\n");
        System.out.println("fact2 -1: " + fact2(-1));
        System.out.println("fact2 0: " + fact2(0));
        System.out.println("fact2 4: " + fact2(4));
        System.out.println("\n\n");
        System.out.println(fact3(1) + "!");
        System.out.println(fact3(2) + "!");
        System.out.println(fact3(3) + "!");
        System.out.println(fact3(4) + "!");

    }
}
