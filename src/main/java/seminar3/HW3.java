package seminar3;

import java.util.*;
import java.util.stream.IntStream;

public class HW3 {
    /*1. Пусть дан произвольный список целых чисел, удалить из него четные числа
    (в языке уже есть что-то готовое для этого)
2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
и среднее арифметическое из этого списка.*/
    public static void main (String[] args) {
        //removeEvenNumbers();
        findMaxEl();
        //findMinEl();
        //findAverEl();
    }

    private static void findMaxEl() {
        ArrayList<Integer> numList = new ArrayList<>();
        Random list = new Random();
        for (int i = 0; i < 20 ; i++) {
            numList.add(list.nextInt(20));

//
//            for (int j = 0; j < numMax.size() ; j++) {
//                Math.max(i);
        }

        System.out.println(numList.toString());
        int sumItems = 0;
        int average = 0;
        for (int item : numList){
            sumItems  += item;
            average = sumItems/numList.size();
            //System.out.println(average);
        }

        System.out.println("Среднее арифметическое число " + average);
        System.out.println("Максимальное число " + Collections.max(numList));
        System.out.println("Минимальное число " + Collections.min(numList));
        //System.out.println("Sum" + sum);
    }

    private static void removeEvenNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random list = new Random();

        for (int i = 0; i < 20 ; i++) {
            numbers.add(list.nextInt(20));
            //System.out.println("Массив до удаления всех четных элементов \n" + numbers);
            for (int j = 0; j < numbers.size() ; j++) {
                if(numbers.get(j) %2 == 0){
                    numbers.remove(j);
                }
            }

        }


        System.out.println("Массив после удаления всех четных элементов \n" + numbers);
    }

}
