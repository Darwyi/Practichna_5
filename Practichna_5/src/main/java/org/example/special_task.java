package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class special_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Запитуємо кількість чисел
        System.out.print("Введіть кількість чисел: ");
        double count = scanner.nextDouble();

        // Запитуємо діапазон чисел
        System.out.print("Введіть мінімальне значення діапазону: ");
        double minRange = scanner.nextDouble();

        System.out.print("Введіть максимальне значення діапазону: ");
        double maxRange = scanner.nextDouble();

        // створення списку
        ArrayList<Double> array = new ArrayList<Double>();

        // Генерую випадкові числа з веденним користувачем діапазоном та додаю згенеровані числа до списку
        for (double i = 0; i < count; ++i) {
            double randomNumber = minRange + (maxRange - minRange) * random.nextDouble();
            array.add((double) Math.round(randomNumber));
        }

        // розрахунок середнього арифметичного з завдання
        double sum = 0;
        for (int i = 0; i < array.size(); ++i) {
            sum += array.get(i);
        }
        double Arifmetic = sum / array.size();

        // розрахунок середнього геометричного з завдання
        double product = 1;
        for (int i = 0; i < array.size(); ++i) {
            product *= array.get(i);
        }
        double geometric = Math.pow(product, 1.0 / array.size());

        // Виводжу результати списку та середнє арифметичне і геометричне
        System.out.println("Список випадкових чисел: " + array);
        System.out.println("Середнє арифметичне: " + Math.round(Arifmetic));
        System.out.println("Середнє геометричне: " + Math.round(geometric));

        scanner.close();
    }
}
