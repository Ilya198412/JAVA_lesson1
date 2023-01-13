package FinalWork;

import java.util.*;

public class LaptopList {
    public static void main(String[] args) {

        NoteBook laptop1 = new NoteBook("Acer", 15.6, "TN", 128, "Intel",
                512, 2, "Windows", 2.6, "black", 3, 22000);
        NoteBook laptop2 = new NoteBook("Asus", 13.9, "IPS", 256, "AMD",
                4096, 4, "Windows", 3, "white", 4, 32000);
        NoteBook laptop3 = new NoteBook("Dell", 14, "TN", 1000, "Intel",
                6128, 8, "NO OS", 2.8, "silver", 6, 43000);
        NoteBook laptop4 = new NoteBook("Honor", 15.6, "TN", 512, "AMD",
                1024, 4, "Windows", 2.5, "red", 5, 34000);
        NoteBook laptop5 = new NoteBook("MSI", 17, "IPS", 128, "AMD",
                512, 16, "Windows", 3.2, "black", 5, 30000);
        NoteBook laptop6 = new NoteBook("Apple", 15.6, "Retina", 512, "Apple M1",
                2048, 2, "Mac OS", 2, "silver", 4, 70000);
        NoteBook laptop7 = new NoteBook("HP", 17, "IPS", 2000, "Intel",
                1024, 8, "NO OS", 3, "black", 6, 43000);
        NoteBook laptop8 = new NoteBook("Asus", 14, "TN", 1024, "AMD",
                512, 4, "Windows", 2.1, "black", 3, 35000);
        NoteBook laptop9 = new NoteBook("Lenovo", 14, "IPS", 256, "Intel",
                4096, 2, "Linux", 2.2, "silver", 3, 25000);
        NoteBook laptop10 = new NoteBook("HP", 15.6, "TN", 512, "AMD",
                1024, 16, "Windows", 2.6, "red", 3, 30000);
        NoteBook laptop11 = new NoteBook("Lenovo", 13.9, "TN", 128, "AMD",
                512, 32, "Windows", 2.4, "white", 6, 25000);
        NoteBook laptop12 = new NoteBook("Asus", 17, "IPS", 512, "Intel",
                6128, 16, "Windows", 2.9, "black", 4, 50000);
        NoteBook laptop13 = new NoteBook("Maibenben", 15.6, "OLED", 2000, "Intel",
                512, 32, "Linux", 2.4, "silver", 6, 30000);

        ArrayList<NoteBook> laptopList = new ArrayList<>();
        Set<NoteBook> laptops = new HashSet<>();
//        Map<String, String> select = selectCriteria();
//        sort(select, laptops);

        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        laptopList.add(laptop4);
        laptopList.add(laptop5);
        laptopList.add(laptop6);
        laptopList.add(laptop7);
        laptopList.add(laptop8);
        laptopList.add(laptop9);
        laptopList.add(laptop10);
        laptopList.add(laptop11);
        laptopList.add(laptop12);
        laptopList.add(laptop13);

        NoteBook FilterLaptop = new NoteBook();

        System.out.println(laptopList);



    }
}

