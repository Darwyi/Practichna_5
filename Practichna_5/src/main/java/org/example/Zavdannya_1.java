package org.example;

import java.util.Scanner;

public class Zavdannya_1 {
    public static void main(String[] args) {
        System.out.println("Завдання 1 || 13 варіант: ");
        // значення з завдання
        double c = 0.7;
        double m = 3 * Math.pow(10, -3);
        double Alpha = 5;
        double n = 1.2;

        // перший приклад
        double x = 5 / Math.sqrt(1+c*Math.exp(-m));

        System.out.printf("Перший приклад зі значеннями з завдання (2 знаки після коми): %.2f",x);

        // другий приклад
        double y = Alpha * (1-Math.cos(c)/Math.sqrt(Math.pow(n,2)-Math.pow(Math.sin(c), 2)));

        System.out.printf("\nДругий приклад зі значеннями з завдання(2 знаки після коми): %.2f", y);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВаріант першого завдання з вашими значеннями\nВведіть значення с: ");
        c = scanner.nextDouble();

        System.out.println("Введіть значення m: ");
        m = scanner.nextDouble();

        System.out.println("Введіть значення Alpha: ");
        Alpha = scanner.nextDouble();

        System.out.println("Введіть значення n: ");
        n = scanner.nextDouble();

        x = 5 / Math.sqrt(1+c*Math.exp(-m));
        y = Alpha * (1-Math.cos(c)/Math.sqrt(Math.pow(n,2)-Math.pow(Math.sin(c), 2)));

        System.out.printf("\nПерший та другий приклади з вашими данними(2 знаки після коми): x = %.2f \n y = %.2f", x, y);
    }
}
