package seminar4;

import java.util.*;

public class MyStack {

    private static LinkedList<String> queue;
    public static void main(String[] args) {
        //push("hello"); // добавить в конец
        peek(); // посмотреть первое в стеке
        //pop(); // посмотреть и извлечь последнее в стеке


    }

    private static void push(String hello) {
        //List<String> greetings = Arrays.asList("banana", "apple", "mango", "orange", "melon", "grapefruit", "coconut");
        Stack<String> greetings = new Stack<>();
        greetings.push(new String ("Hi"));
        greetings.push(new String ("Good Morning"));
        greetings.push(new String ("Good Evening"));
        greetings.push(new String ("Good Day"));
        greetings.push(new String ("Hello"));
        System.out.printf("Виды приветствий - " + greetings);
        System.out.println(greetings.pop());
    }
    private static String peek() {
        Stack fruitsBasket = new Stack();
        fruitsBasket.push(new String ("banana"));
        fruitsBasket.push(new String ("apple"));
        fruitsBasket.push(new String ("mango"));
        fruitsBasket.push(new String ("orange"));
        fruitsBasket.push(new String ("melon"));
        System.out.println("Fruit basket contain : " + fruitsBasket);
        System.out.println("Fruit basket contain : " + fruitsBasket.peek());
        System.out.println(fruitsBasket);



        return "";
    }
    private static String pop() {

        Stack<String> fruitsBasket = new Stack<>();
        fruitsBasket.push(new String ("banana"));
        fruitsBasket.push(new String ("apple"));
        fruitsBasket.push(new String ("mango"));
        fruitsBasket.push(new String ("orange"));
        fruitsBasket.push(new String ("melon"));
        System.out.println("Fruit basket contain : " + fruitsBasket);
        //fruitsBasket.pop();
        System.out.printf("Last fruit - " + fruitsBasket.pop());
        System.out.println(fruitsBasket);

        return "";

    }
}
