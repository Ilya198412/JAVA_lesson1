package lesson1;

import javax.swing.*;
import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//    5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
//
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

public class HW1 {
    public static void main(String[] args) {

        //System.out.println("Результат выполнения: " + task1());
        //System.out.println("Your number " + task2());
        //System.out.println("Result " + task3());
        //task4();
        //System.out.println("Year is leap? -   " + task5());
        //System.out.println("Inverted array" + task6());
        //System.out.println("Massive on 100 numbers" + task7());
        //System.out.println("multiplied array " + task8());
        System.out.println("two-dimensional array -  " + twoDimArray()); // ---
       // System.out.println(wordbuild("HI", 5));
        //System.out.println("Maximal element in array " + task11());
        //System.out.println("Minimal element in array " + task12());
    }


    private static boolean task1() {
        //    1. Написать метод, принимающий на вход два целых числа и проверяющий,
        //    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
        //    true, в противном случае – false.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter second number");
        int num2 = in1.nextInt();
        int result = num1 + num2;

//        System.out.printf("Result of summation %s + %s = %d  ", num1, num2,result);
//        System.out.printf("Condition is %s", result);

        if (result <= 20 && result >= 10) {
            return true;
//            System.out.println("True");
        } else {
            return false;
//            System.out.println("False");
        }
    }

    private static String task2() {
        //    2. Написать метод, которому в качестве параметра передается целое число,
        //    метод должен напечатать в консоль, положительное ли число передали или
        //    отрицательное. Замечание: ноль считаем положительным числом.
        Scanner scaner1 = new Scanner(System.in);
        System.out.println("Enter number");
        int number1 = scaner1.nextInt();
        if (number1 >= 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    private static boolean task3() {
        //3. Написать метод, которому в качестве параметра передается целое число. Метод должен
        // вернуть true,если число отрицательное, и вернуть false если положительное.
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number");
        int num = number.nextInt();
        if (num >= 0) {
            return false;
        } else {
            return true;
        }

    }

    private static String task4() {
        //4. Написать метод, которому в качестве аргументов передается строка и число,
        // метод должен отпечатать в консоль указанную строку, указанное количество раз;
        Scanner text = new Scanner(System.in);
        System.out.println("Enter your expression: ");
        String name = text.nextLine();
        System.out.printf("your expression %s%n", name);
        Scanner number = new Scanner(System.in);
        System.out.printf("Enter number ");
        int num = number.nextInt();
        String[] arr = {};
        while (num > 0) {
            num -= 1;

            System.out.println(name);
        }
        return "";
    }

    private static boolean task5() {
        //5. * Написать метод, который определяет, является ли год високосным, и
        // возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год
        // является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        Scanner year = new Scanner(System.in);
        System.out.println("Enter year");
        int num = year.nextInt();
        if (num % 400 == 0) {
            return true;
        } else if (num % 100 == 0) {
            return false;
        } else if (num % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    private static String task6() {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
        // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int counter = 0;
        int result = 0;

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (arr[i] == 1) ? 0 : 1; // если результат выражения верный то вернется 0 если ложный то вернет 1
        }
        System.out.println(Arrays.toString(arr));
        {
            return "";
        }
    }

    private static String task7() {
        //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
        // значениями 1 2 3 4 5 6 7 8 … 100;
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        { return "";}
}
    private static String task8() {
        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и
        // числа меньшие 6 умножить на 2;
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            } else {
            }
        }
        System.out.println(Arrays.toString(arr));
        {return "";        }
    }

    private static String twoDimArray() {
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и
// с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
// если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int[][] twoDimArr = new int[4][4];
        //System.out.println(twoDimArr);

        for (int i = 0; i < twoDimArr.length; i++) {

                System.out.println(" " + twoDimArr[i][i] + " ");
            }

        System.out.println();
        {
            return "";
        }
    }


    private static String wordbuild(String initialValue, int len ) {
        //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
        // типа int длиной len, каждая ячейка которого равна initialValue;

        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i< len; i++) {
            sb.append(initialValue);
        }
        return sb.toString();
    }

    private static String task11() {
        //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
//        Random random = new Random();
        int[] arr = {10, 2, 3, 4, 5, 11, 56, 886, 43, 2, 2};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
            }
        System.out.println(max);
        {
            return "";
        }
    }

    private static String task12() {
        //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
//        Random random = new Random();
        int[] arr = {10, 2, 3, 4, 5, 11, 56, 886, 43, 2, 2};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < min) {
                min = arr[i];
            }
        System.out.println(min);
        {
            return "";
        }
    }
}




























