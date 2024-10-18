package org.example;

import java.util.Scanner;

public class Zavdanya_2 {
    public static double function(double x, double a, double b) {
        if (x >= -0 && x < 7)  {
            // при х більше або дорівнює -0 та х менше 7 x є [-0, 7)
            return Math.sin(5 * x);
        } else if (x == 7) {
            // при х = 7
            return Math.pow(x,2) - b * x;
        } else if (x > 7 && x <= 10) {
            // при х є (7, 10)
            return Math.log(a * x - 8);
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Завдання 2 || 13 варіант: ");
        double x = 7;

        // Користувач вводить свої значення для а та b
        System.out.println("Введіть значення а: ");
        double a = scanner.nextDouble();

        System.out.println("Введіть значення b: ");
        double b = scanner.nextDouble();

        //вивід функції
        double result = function(x, a, b);
        System.out.println("Функія f(" + x + ") = " + result);

        scanner.close();
    }
}
