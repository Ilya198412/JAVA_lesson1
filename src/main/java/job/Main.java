package job;



import java.util.HashSet;
import java.util.Set;

public class  Main {
    public static void main(String[] args) {
// Создание объектов класса Laptop

        Laptop laptop1 = new Laptop("Acer", 15.6, "TN", 128, "Intel",
                512, 2, "Windows", 2.6, "black", 3, 22000);
        Laptop laptop2 = new Laptop("Asus", 13.9, "IPS", 256, "AMD",
                4096, 4, "Windows", 3, "white", 4, 32000);
        Laptop laptop3 = new Laptop("Dell", 14, "TN", 1000, "Intel",
                6128, 8, "NO OS", 2.8, "silver", 6, 43000);
        Laptop laptop4 = new Laptop("Honor", 15.6, "TN", 512, "AMD",
                1024, 4, "Windows", 2.5, "red", 5, 34000);
        Laptop laptop5 = new Laptop("MSI", 17, "IPS", 128, "AMD",
                512, 16, "Windows", 3.2, "black", 5, 30000);
        Laptop laptop6 = new Laptop("Apple", 15.6, "Retina", 512, "Apple M1",
                2048, 2, "Mac OS", 2, "silver", 4, 70000);
        Laptop laptop7 = new Laptop("HP", 17, "IPS", 2000, "Intel",
                1024, 8, "NO OS", 3, "black", 6, 43000);
        Laptop laptop8 = new Laptop("Asus", 14, "TN", 1000, "AMD",
                512, 4, "Windows", 2.1, "black", 3, 35000);
        Laptop laptop9 = new Laptop("Lenovo", 14, "IPS", 256, "Intel",
                4096, 2, "Linux", 2.2, "silver", 3, 25000);
        Laptop laptop10 = new Laptop("HP", 15.6, "TN", 512, "AMD",
                1024, 16, "Windows", 2.6, "red", 3, 30000);
        Laptop laptop11 = new Laptop("Lenovo", 13.9, "TN", 128, "AMD",
                512, 32, "Windows", 2.4, "white", 6, 25000);
        Laptop laptop12 = new Laptop("Asus", 17, "IPS", 512, "Intel",
                6128, 16, "Windows", 2.9, "black", 4, 50000);
        Laptop laptop13 = new Laptop("Maibenben", 15.6, "OLED", 2000, "Intel",
                512, 32, "Linux", 2.4, "silver", 6, 30000);



        //acer_a313.addBrand(brandAcer);
// Создание множества
        Set <Laptop> laptop = new HashSet<>();
        laptop.add(laptop1);
        laptop.add(laptop2);
        laptop.add(laptop3);
        laptop.add(laptop4);
        laptop.add(laptop5);
        laptop.add(laptop6);
        laptop.add(laptop7);
        laptop.add(laptop8);
        laptop.add(laptop9);
        laptop.add(laptop10);
        laptop.add(laptop11);
        laptop.add(laptop12);
        laptop.add(laptop13);
// создание нового объекта вызова методов
        Laptop FilterLaptop = new Laptop();
// вызов метода фильтрации по определеннеым параметрам
        // System.out.println("по вашему запросу найдено: " + FilterLaptop.filter(laptop));

// вызод метода фильтрации по заданным пользователем критериям
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}