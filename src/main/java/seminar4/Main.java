package seminar4;

import lection3.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //time();
        addList();
    }

    private static void addList() {
        Scanner in = new Scanner(System.in);
        ArrayList<String> wordsList = new ArrayList<>();
        Collections.addAll(wordsList, "apple", "orange", "banana", "strawberry", "melon");
        int num = 0;

        while (true) {
            System.out.println();
            System.out.println("Введите строку: ");
            String inputString = in.nextLine();

            if (inputString.length() == 0) {
                System.out.println("строка не может быть пустой ");
                continue;
            }
            if (inputString.equals("print~all")) {
                for (int i = 0; i < wordsList.size(); i++) {
                    System.out.printf("%d) %s%n", i + 1, wordsList.get(i));
                }

            } else if (inputString.equals("stop")) {
                System.exit(0);
            }

            if (inputString.contains("\\~")) {
                System.out.println("строка не содержит тильду");
                continue;
            }
            String[] parts = inputString.split("\\~");
            String word = parts[0];
            try {
                num = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Выражение не содержит числа");
                continue;
            }
            if (num <= 0 || num > wordsList.size() + 1) {
                System.out.println("Число должно быть в пределах списка от 1 до " + (wordsList.size() + 1));
                continue;
            }
            if (word.equals("print")) {
                System.out.printf("Под номером %d находится слово %s%n", num, wordsList.get(num - 1));
            } else if (num == wordsList.size() + 1) {
                wordsList.add(word);
                System.out.printf("Слово  %s добавлено на позицию %d%n", word, num);

            } else {
                String oldWord = wordsList.get(num - 1);
                wordsList.set(num -1, word);
                System.out.printf("Слово %s заменило на позиции %d слово %s%n", word, num , oldWord);
            }
        }
    }

    public static void time(){
    long start = System.currentTimeMillis();
    ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
        arrayList.add(0, 100);

    }
        System.out.println("Время");
        System.out.println(System.currentTimeMillis() - start);
    start = System.currentTimeMillis();
    LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
        linkedList.add(0, 100);
    }
        System.out.println("Время - 1");
        System.out.println(System.currentTimeMillis() - start);
    }
}
