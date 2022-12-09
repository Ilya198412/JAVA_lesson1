package lesson1;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

        ex3();

    }

    private static void ex5() {
    }

    private static void ex4() {

        Random random = new Random();
//
        int[] arr = new int[20];
        final int VAL = 3;

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(1, 5);
        }

        System.out.println(Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[right] == VAL) {
                right--;
            } else if (arr[left] == VAL) {
                arr[left] = arr[right];
                arr[right] = VAL;
                right--;
                left++;
            } else if (arr[left] != VAL) {
                left++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }


    private static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
//        System.out.println("Привет!" + name);
        System.out.printf("Привет, %s%n", name );
    }

    private static void ex2() throws IOException {
        System.out.println("Пожалуйста, введите имя:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.printf("Привет, %s%.2f", name);
    }

    private static void ex3() {
        int counter = 0;
        int result = 0;
        Random random = new Random();
//        int[] binaryArray = {1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1};
        int[] binaryArray = new int[1000];
        for (int i = 0; i < binaryArray.length - 1; i++) {
            binaryArray[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(binaryArray));

        for (int i : binaryArray) {
            if (i == 1) {
                counter += 1;
            } else {
//                result = result > counter ? result : counter;
                result = Math.max(result,counter);
                counter = 0;
            }
        }
        System.out.println(result > counter ? result : counter);
    }



}

