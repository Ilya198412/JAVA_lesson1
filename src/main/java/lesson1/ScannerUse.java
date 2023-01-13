package lesson1;

import java.util.Scanner;

public class ScannerUse {
    public static void main(String[] args) {
        System.out.println("Enter parameter to search:");
        var searchParam = new Scanner(System.in).nextLine();
        System.out.println("Hi my parameter: " + searchParam);
    }
}
