package seminar4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    private static LinkedList<String> queue;
    public static void main(String[] args) {
        //add("hello"); // добавить в конец
        //peek(); // посмотреть первое в очереди
        poll(); // извлечь и вернуть первое в очереди


    }





    private static void add(String hello) {
        Queue<String> greetings = new LinkedList<>();
        Collections.addAll(greetings, "Hi", "Good Morning", "Good Evening", "Good Day" );
//        greetings.add(new String ("Hi"));
//        greetings.add(new String ("Good Morning"));
//        greetings.add(new String ("Good Evening"));
//        greetings.add(new String ("Good Day"));
        greetings.add(new String ("Hello"));
        System.out.println("Greeting are - " + greetings );
    }
    private static String peek() {
        Queue<String> greetings = new LinkedList<>();
        Collections.addAll(greetings, "Hi", "Good Morning", "Good Evening", "Good Day" );
        System.out.println("Greeting are - " + greetings );
        System.out.println("Show first Greeting - " + greetings.peek());
        return "";
    }
    private static String poll() {
        Queue<String> greetings = new LinkedList<>();
        Collections.addAll(greetings, "Hi", "Good Morning", "Good Evening", "Good Day" );
        System.out.println("Greeting are - " + greetings );
        greetings.poll();
        System.out.println("Greeting after poll using  - " + greetings );
        return "";

    }
}
