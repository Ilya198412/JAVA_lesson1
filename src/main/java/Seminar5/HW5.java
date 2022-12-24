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
        phoneBook.put("Kangaroo",  new ArrayList<>());
        phoneBook.put("Elephant",  new ArrayList<>());
        phoneBook.put("Monkey",  new ArrayList<>());
        phoneBook.put("Tiger",  new ArrayList<>());
        phoneBook.put("Lion",  new ArrayList<>());
        phoneBook.put("Snake",  new ArrayList<>());
        phoneBook.get("Kangaroo").add("3333");
        phoneBook.get("Kangaroo").add("4444");
        phoneBook.get("Kangaroo").add("55555");
        phoneBook.get("Snake").add("55555");
        phoneBook.get("Snake").add("55555");
        phoneBook.get("Snake").add("55555");
        phoneBook.get("Tiger").add("55555");
        phoneBook.get("Lion").add("55555");
        phoneBook.get("Monkey").add("55555");
        phoneBook.put("Cake",  new ArrayList<>());
        phoneBook.get("Cake").add("21312");

        for(Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(userName)) {
                System.out.printf("%s numbers - %s%n", entry.getKey(), entry.getValue());
            }
        }

        //System.out.println("-" + phoneBook.get("Timoha"));


    }
}
