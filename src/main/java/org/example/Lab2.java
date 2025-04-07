package org.example;

import java.util.Random;
import java.util.Scanner;

public class Lab2 {
    private static final int MIN_RANDOM = 1;
    private static final int MAX_RANDOM = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість рядків (не більше 20): ");
        int rows = scanner.nextInt();
        System.out.println("Введіть кількість стовпців (не більше 20): ");
        int cols = scanner.nextInt();

        if (rows > 20 || cols > 20) {
            System.out.println("Максимальний розмір матриці 20x20!");
            return;
        }

        int[][] matrix = new int[rows][cols];
        System.out.println("Виберіть метод заповнення матриці:");
        System.out.println("1 - Ввести вручну");
        System.out.println("2 - Заповнити рандомно");
        int choice = scanner.nextInt();
        if (choice == 1) {
            // введення вручну
            System.out.println("Введіть елементи матриці:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.printf("matrix[%d][%d]: ", i, j);
                    matrix[i][j] = scanner.nextInt();
                }
            }
        } else if (choice == 2) {
            // рандом
            Random rand = new Random();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = rand.nextInt(MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM;
                }
            }
        } else {
            System.out.println("Невірний вибір!");
            return;
        }
        System.out.println("Ваша матриця:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Пошук мін, макс та сер.ар.
        int min = findMin(matrix);
        int max = findMax(matrix);
        double average = calculateAverage(matrix);
        System.out.println("Мінімум: " + min);
        System.out.println("Максимум: " + max);
        System.out.println("Середнє арифметичне: " + average);

        // сер геом
        double geoMean = calculateGeometricMean(matrix);
        System.out.println("Середнє геометричне: " + geoMean);
    }

    // мінімум
    private static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }
        }
        return min;
    }

    // максимум
    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    // сер. арифм
    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
                count++;
            }
        }
        return (double) sum / count;
    }

    //сер. геом
    private static double calculateGeometricMean(int[][] matrix) {
        double product = 1;
        int count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                product *= num;
                count++;
            }
        }
        return Math.pow(product, 1.0 / count);
    }
}
