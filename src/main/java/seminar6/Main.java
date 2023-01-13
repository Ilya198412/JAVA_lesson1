package seminar6;

import java.util.*;

import static java.util.Arrays.fill;

public class Main {
    public static void main(String[] args) {
        //hashset();
        //linkedHashSet();
//        System.out.println("Apple".compareTo("Orange"));
        //fill();
        treeSet();
    }

    private static void fill() {

        Integer[] arr = new Integer[100];
        Random random = new Random();
        for (int i = 0; i <100; i++) {
            arr[i] = random.nextInt(1, 101);


        }
        HashSet<Integer> uniq = new HashSet<>(Arrays.asList(arr));
        System.out.println(1.0 * uniq.size() *100 / arr.length);
    }

    private static void treeSet() {
        var num1 = new TreeSet<>(Arrays.asList("Apple", "Orange" ));
        System.out.println(num1);
        var num2 = new LinkedHashSet<>(Arrays.asList(1,2,3,2,4,7,5,6,3));
        System.out.println(num2);
        var num = new HashSet<>(Arrays.asList(1,2,3,2,4,7,5,6,3));
        System.out.println(num);
    }

    private static void linkedHashSet() {


    }

    private static void hashset() {



    }
}
