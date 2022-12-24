package Lection5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> db = new HashMap<>();
        db.putIfAbsent(1, "one");
        db.put(2, "two");
        db.put(null, "!null");
        System.out.println(db);
        System.out.println(db.get(2));
        db.remove(null);
        System.out.println(db);
        System.out.println(db.containsValue("one"));
        System.out.println(db.containsValue(1));
        System.out.println(db.containsKey("one"));
        System.out.println(db.containsKey(1));
        System.out.println(db.keySet());
        System.out.println(db.values());


    }

}
