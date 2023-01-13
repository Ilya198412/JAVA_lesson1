package seminar6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;



public class Main1 {
    public static void main(String[] args) {

            Cat cat1 = new Cat("Барсик", 10, 1, "Черный", "Британец");
//        cat.setName("Барсик");
//        cat.setAge(12);
//        cat1.jump();
//        cat1.run();
            //cat1.printInfo();
            System.out.println("\n -----------");
            Cat cat2 = new Cat("Пушок", 22, 2, "Серый", "Мейкун");
            Cat cat3 = new Cat("Пушок33", 33, 3, "Фиолет", "Уличный");
//        cat2.printInfo();
            ArrayList<Cat> catArrayList = new ArrayList<>();
            catArrayList.add(cat1);
            catArrayList.add(cat2);
            catArrayList.add(cat3);
            catArrayList.remove(cat1);
            cat2.setSpeak(true);

            for (Cat cat : catArrayList) {
//            System.out.println(item);
                //cat.printInfo();
                cat.run();
//                cat.jump();
                cat.speak();
                //cat.getColor();
                cat.getBreed();

                //cat.getAge();
                //System.out.println(cat.getAge());
            }

        }

//            ArrayList<Integer> list = new ArrayList<>();
//            Random random = new Random();
//            for (int i = 0; i < 1000; i++)
//                list.add(random.nextInt(0, 100));
//        System.out.println(list);
//        System.out.println(ex(list));
//        private static double ex (ArrayList < Integer > list) {
//            Set<Integer> set = new HashSet<>(list);
//            double res = (double) set.size() * 100 / list.size();
//            return res;
//        }
    }
