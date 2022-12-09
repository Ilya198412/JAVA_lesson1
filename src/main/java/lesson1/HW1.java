package lesson1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


//    1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
//    2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
//    3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//    4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
//    5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
//
//
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

public class HW1 {
    public static void main(String[] args) {

        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
//        task8();
        task9();
    }


    private static void task1() {
        //    1. Написать метод, принимающий на вход два целых числа и проверяющий,
        //    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
        //    true, в противном случае – false.

        Scanner scaner1 = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = scaner1.nextInt();
        Scanner scaner2 = new Scanner(System.in);
        System.out.println("Enter second number");
        int number2 = scaner2.nextInt();
        int result = number1 + number2;
        int res=result;
        System.out.printf("Result of summation %s + %s = %d  ", number1, number2, res);
        System.out.printf("Condition is %s", result);

        if (result <= 20 && result >= 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    private static void task2() {
        //    2. Написать метод, которому в качестве параметра передается целое число,
        //    метод должен напечатать в консоль, положительное ли число передали или
        //    отрицательное. Замечание: ноль считаем положительным числом.
        Scanner scaner1 = new Scanner(System.in);
        System.out.println("Enter number");
        int number1 = scaner1.nextInt();
        if (number1>=0) {
            System.out.printf("Your number = %s is positive ", number1);
        } else {
            System.out.printf("Your number = %s is negative", number1);
        }
    }
    private static boolean task3() {
        //3. Написать метод, которому в качестве параметра передается целое число. Метод должен
        // вернуть true,если число отрицательное, и вернуть false если положительное.
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number");
        int num = number.nextInt();
        if (num >= 0){
            System.out.printf("false");
            return false;
        } else {
            System.out.printf("true");
            return true;

        }

    }
    private static void task4() {
        //4. Написать метод, которому в качестве аргументов передается строка и число,
        // метод должен отпечатать в консоль указанную строку, указанное количество раз;
        Scanner text = new Scanner(System.in);
        System.out.println("Enter your expression: ");
        String name = text.nextLine();
        System.out.printf("your expression %s%n", name);
        Scanner number = new Scanner(System.in);
        System.out.printf("Enter number ");
        int num = number.nextInt();
        while (num>0) {
            num-=1;
            System.out.println(name);
        }
    }
    private static boolean task5() {
        //5. * Написать метод, который определяет, является ли год високосным, и
        // возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год
        // является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        return false;
    }



//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    private static void task6() {
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
    }

    private static void task7() {
        //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
        // значениями 1 2 3 4 5 6 7 8 … 100;
        int[] arr = new int[100];
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length; i++) {
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void task8() {
        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и
        // числа меньшие 6 умножить на 2;
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            } else {
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void task9() {
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и
// с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
// если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    }
    private static void task10() {
        //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
        // типа int длиной len, каждая ячейка которого равна initialValue;


    }
}




























