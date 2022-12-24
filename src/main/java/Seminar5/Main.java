package Seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //passportSer();
        System.out.println(romanNumbers("MCMXXIX"));
    }

    private static Integer romanNumbers(String romanNum) {
        //String romanNum = "MCMXXIX";
        Map<Character, Integer> romanToDecimalMap = Map.of (
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int lastIndex = romanNum.length()- 1;
        char lastRomanChar = romanNum.charAt((lastIndex));
        int decimalNum = romanToDecimalMap.get(lastRomanChar);
        int prevNum = decimalNum;

        for (int i = 0; i < lastIndex; i++) {
            int currentIndex = lastIndex -1 - i;
            char currentRomanChar = romanNum.charAt(currentIndex);
            int currentNum = romanToDecimalMap.get(currentRomanChar);

//            int prevIndex = currentIndex +1;
//            char prevRomanChar = romanNum.charAt(prevIndex);
//            int prevNum = romanToDecimalMap.get(prevRomanChar);

            if (currentNum<prevNum) {
                currentNum *=-1;
            }

            prevNum = currentNum;
            decimalNum += currentNum;

        }




        return decimalNum;

    }

    private static void passportSer() {
        //String userName = "Vasiliev";
        Scanner userName = new Scanner(System.in);
        System.out.println("enter userName" );
        String secName = userName.next();
        Map<String, String> passports = new HashMap<>();
        passports.put("12345", "Ivanov");
        passports.put("321456", "Vasiliev");
        passports.put("43535", "Ivanov");
        passports.put("345277", "Vasiliev");
        passports.put("567445", "Ivanov");
        passports.put("876845", "Petrova");


        for (String key : passports.keySet()) {
            if(passports.get(key).equals(secName)) {
                System.out.printf("%s - %s%n", key, passports.get(key));
            }
        }

//        for (Map.Entry<String, String> entry : passports.entrySet()){
//            if (entry.getValue().equals(userName)) {
//                System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
//            }
//        }

    }
}
