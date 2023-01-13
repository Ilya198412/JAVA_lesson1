package FinalWork;



import java.util.*;



public class Main {
}
/*
    public static void main(String[] args) {


        //System.out.println(laptopSearch("Honor",laptopList ));


        private static Map<String, String> selectCriteria () {
            Map<String, String> resultCriterias = new HashMap<>();
            while (true) {
                System.out.println("Do you want to search? Enter 'y', if not enter 'n'");
                String question = searchOfClient();
                if (question.equals("n")) {
                    break;
                } else {
                    System.out.println("Enter number of parameters you want to search: \n 1 - Brand of Laptop \n" +
                            " 2 - Screen Size \n 3 - Type of matrix \n 4 - Hard Disk Size \n 5 - Processor manufacturer \n " +
                            "6 - Graphics Coprocessor Memory \n 7 - RAM - operative memory \n 8 - Operating System" +
                            "\n 9 - Weight of Laptop \n 10 - Colour of Laptop \n 11 - Average Battery Life (in hours) \n" +
                            " 12 - Price of Laptop");
                    String key = searchOfClient();
                    System.out.println("Enter values of chosen criteria");
                    String value = searchOfClient();
                    resultCriterias.put(key, value);


                }

            }


            return resultCriterias;
        }





        public static void sort (Map < String, String > criterias, Set < NoteBook > notebooks){

            Set<NoteBook> temp = new HashSet<>(notebooks);
            for (NoteBook notebook : notebooks) {

                for (Object pair : criterias.keySet()) {

                    if (pair.equals("1") && !notebook.getBrand().equals(criterias.get(pair))) {
                        temp.remove(notebook);
                    }
                    for (Object pair1 : criterias.keySet()) {

                        if (pair1.equals("2") && !notebook.getScreenDisplaySize().equals(criterias.get(pair1))) {
                            temp.remove(notebook);

                        }
                        for (Object pair2 : criterias.keySet()) {

                            if (pair2.equals("4") && !notebook.getHardDriveSize().equals(criterias.get(pair2))) {
                                temp.remove(notebook);

                            }
                            for (Object pair3 : criterias.keySet()) {

                                if (pair3.equals("8") && !notebook.getOperatingSystem().equals(criterias.get(pair3))) {
                                    temp.remove(notebook);

                                }
                                for (Object pair4 : criterias.keySet()) {

                                    if (pair4.equals("10") && !notebook.getColour().equals(criterias.get(pair4))) {
                                        temp.remove(notebook);

                                    }
                                }
                            }
                        }
                    }
                }

            }
            if (temp.isEmpty()) {
                System.out.println("По введенным критериям ничего не найдено!");
            } else {
                System.out.println("Вот что мы можем предложить: \n" + temp.toString());
            }
        }
    }

}
*/








