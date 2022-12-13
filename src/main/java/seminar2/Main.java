package seminar2;

import java.awt.datatransfer.FlavorEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger("Lesson 2");
    public static void main(String[] args) {
        /*System.out.println(buildstring('X', 'o', 21 ));
        System.out.println(buildstring());
        System.out.println(doSimpleString("aaaaassssdffftytytytttt ghhjjj"));*/
        printIntoFileNames("E:\\Илья\\обучение");
    }

    private static void printIntoFileNames(String path) {
        StringBuilder sb = new StringBuilder();
        logger.setLevel(Level.ALL);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);

        String[] names = convertPathToNameArr(path); // отсюда тянем путь
        if (names == null) {
            try {
                throw new RuntimeException("не содержит значимых файлов" + "дирикторией");
            } catch (RuntimeException e) {
                logger.severe(e.getMessage());
            }
            return;
        }
        for (String name : names) {
            sb.append(name).append(System.lineSeparator());
        }

        try (PrintWriter pw = new PrintWriter("E:\\Илья\\обучение\\JAVA\\lesson1\\src\\main\\resources\\files\\dir_files.txt")) {
            pw.print(sb.toString());
        } catch (FileNotFoundException e) {
            logger.severe("File not found" + e.getMessage());
            System.out.println(e.getMessage());

        }

    }
    private static  String[] convertPathToNameArr(String path) {
        File file = new File(path);
        return file.list();

    }

    private static String doSimpleString(String str) {

        // отработка ошибок
        //empty() - "" - true проверяет строку на пустоту(если будут пробелы, то сломается проверка)
        //"" != null - true
        // "   " - isBlank() - будет считать строку пустой
        // "         hello      " -> "hello" -> trim() удаление всего лишнего
        //if (str.isBlank()) {
        if (str.trim().length() == 0) {
            return "";
        }
        int counter = 1;
        StringBuilder sb = new StringBuilder();
        char prev = str.charAt(0);
        char curr = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            curr =str.charAt(i);
            prev = str.charAt(i-1);

            if (curr != prev) {
                sb.append(prev);
                sb.append((counter > 1) ? counter : "");
                counter  = 0;
            }
            counter ++;
//            if (curr !=prev) {
//            }
        }
        if (counter != 0) {
            sb.append(curr);
            sb.append((counter > 1) ? counter : "");
        }
        return  sb.toString();
    }

    private static String buildstring(char c1, char c2, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0)  {
                sb.append(c1);
            } else{
                sb.append(c2);
            }
        }

        return sb.toString();
    }
    private static String buildstring() {
        return buildstring('Z', 'V', 10 );
    }

}

