package seminar2;

import com.sun.source.tree.BreakTree;

import java.io.*;

public class HW2 {
    /*1. Напишите метод, который принимает на вход строку (String) и определяет
    является ли строка палиндромом (возвращает boolean значение).*/
    public static final String PATH = "E:\\Илья\\обучение\\JAVA\\lesson1\\src\\main\\java\\lection3";



    public static void main(String[] args) {

        System.out.println(wordBuildSave("Test", 100));
        System.out.println(saveWord());
        //System.out.println(palindrom("carrace"));
    }


    public static boolean palindrom(String stringToCheck) {
        /*1. Напишите метод, который принимает на вход строку (String) и определяет
    является ли строка палиндромом (возвращает boolean значение).*/
        String strRep = stringToCheck.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); /*
        приводим текст к нижнему регистру, Методы toLowerCase() и toUpperCase() меняют регистр символов
        c помощью регулярного выражения очищаем строку для считывания методом replaceAll от всего лишнего(запятые, точки и пр. символы) */
        //System.out.println(strRep);
//        strRepString sToCh = strRep.trim();
//        String[] palin = sToCh.split("");
        String reversed = new StringBuffer(strRep).reverse().toString(); /* пропускаем через StringBuffer(временное хранилище-буфер)
        reverse() — меняет порядок всех символов на противоположный привести к строковому представлению, используя метод toString() */
        //System.out.println(reversed);
        return reversed.equals(strRep); //

    }

//2. Напишите метод, который составит строку, состоящую из 100
//    повторений слова TEST и метод, который запишет эту строку в простой текстовый файл,
//    обработайте исключения.*/

    public static void printInFile(String path) {

    }

    public static String wordBuildSave(String word, int length) {
        /* метод выводит слово(word) данное в условиии столько раз, чему равно число выводов length  */
        StringBuilder wb = new StringBuilder();
        for (int i = 0; i<length; i++) {
            wb.append(word);
        }
        System.out.println("Повторение слова 100 раз - ");
        return wb.toString();
    }

    public static String saveWord() {
        File dir = new File(PATH);

        if (dir.exists()) {
            System.out.println("Ok");
        } else {
            System.out.println("dir is wrong");
        }
        File newFile = new File(dir, "test.txt");
        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Fault of creation file" + e.toString());
            }
            File fileOut = new File(PATH, "test.txt");
            try (OutputStream os = new FileOutputStream(fileOut, true)) {
                String text = wordBuildSave("Test", 100);
                os.write(text.getBytes());
            } catch (FileNotFoundException e) {
                System.out.println("No file");
            } catch (IOException e) {
                System.out.println("error of saving");
            }


//        StringBuilder sb = wordBuildSave();
//        File file = new File();
//        return file.list();

        }
        return null;
    }
}
