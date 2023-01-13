package Seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class HW5 {
    public static void main(String[] args) {
        contacts();

    }

    private static void contacts() {
        //String userName = "Kangaroo";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        String userName = scan.next();
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        phoneBook.putIfAbsent("Kangaroo",  new ArrayList<>());
        phoneBook.putIfAbsent("Elephant",  new ArrayList<>());
        phoneBook.putIfAbsent("Monkey",  new ArrayList<>());
        phoneBook.putIfAbsent("Tiger",  new ArrayList<>());
        phoneBook.putIfAbsent("Lion",  new ArrayList<>());
        phoneBook.putIfAbsent("Snake",  new ArrayList<>());
        phoneBook.get("Kangaroo").add("3333");
        phoneBook.get("Kangaroo").add("4444");
        phoneBook.get("Kangaroo").add("55555");
        phoneBook.get("Snake").add("55555");
        phoneBook.get("Snake").add("55555");
        phoneBook.get("Snake").add("55555");
        phoneBook.get("Tiger").add("55555");
        phoneBook.get("Lion").add("55555");
        phoneBook.get("Monkey").add("55555");
        phoneBook.putIfAbsent("Cake",  new ArrayList<>());
        phoneBook.get("Cake").add("21312");

        for(Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(userName)) {
                System.out.printf("%s numbers - %s%n", entry.getKey(), entry.getValue());
            }
        }

        //System.out.println("-" + phoneBook.get("Timoha"));


    }
}
