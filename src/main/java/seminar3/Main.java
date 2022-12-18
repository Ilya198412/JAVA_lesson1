package seminar3;

import lection3.Array;

import java.util.*;

public class Main {

    public static void main (String[] args) {
        //ex1();
        //paradOfPlanet();
        //paradOfPlanet_1();
        paradOfPlanet_2();
    }

    private static void paradOfPlanet_2() {
        List<String> planets = Arrays.asList("Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
                "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");
        Map<String,Integer> freqByPlanet =new HashMap<>();
        for (String planet : planets) {
            Integer freq = freqByPlanet.getOrDefault(planet,0);
            freqByPlanet.put(planet, ++freq);
        }
        freqByPlanet.forEach((planet, freq) -> System.out.printf("%s\t-\t%s раз\n", planet, freq));
    }

    private static void paradOfPlanet_1() {
        List<String> planetList = Arrays.asList("Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
                "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");

        planetList.stream().distinct().forEach(planet-> System.out.printf("%s\t-\t%s hfp\n", planet,
                planetList.stream().filter(planet::equals).count() ));
    }

    private static void paradOfPlanet() {
        List<String> planetList = Arrays.asList("Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
                "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");
        List<String> countPlanet = new ArrayList<>();
        for (int i = 0; i < planetList.size()-1; i++) {
            int counter = 1;
            for (int j = 1; j < planetList.size(); j++) {
                if (planetList.get(i) == planetList.get(j)) {counter+=1;}


            if(countPlanet.contains(planetList.get(i)) == false) {
                    countPlanet.add(planetList.get(i));
                    System.out.printf("%s,%s\n", planetList.get(i), counter);
                }
            counter = 1;
            }
        }
    }

    public static void ex1() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
             list.add(random.nextInt(100));
        }
        //list.sort(Comparator.naturalOrder());
        //Collections.sort(list);
        list.sort(Integer::compare);

        System.out.println(list);

    }
}
