package job;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// Создание класса Laptop
public class Laptop {
// Создание поля на основе другого класса
    private List<Brand> brands;
// Создание полей
private String brand; // производитель
    private double screenDisplaySize; // размер дисплея
    private String matrixType; // тип экрана
    private int flashMemorySize; // объем SSD диска
    private int hardDriveSize; // объем жесткого диска
    private String processorBrand; // производитель процессора
    private int graphicsCardRAMSize; // размер памяти видеокарты
    private int RAMMemorySize; // размер оперативной памяти
    private String operatingSystem; // операционная система
    private double weightOfLaptop; // вес ноутбука
    private String colourOfLaptop; // цвет ноутбука
    private double averageBatteryLife; //  работа от аккумулятора
    private double priceOfLaptop; // цена ноутбука

// Создание пустого конструктора для работы с методами
    public Laptop() {
    }
// Создание конструктора для создания экземпляров класса
    public Laptop(String brand, double screenDisplaySize, String matrixType, int hardDriveSize, String processorBrand, int graphicsCardRAMSize,
                  int RAMMemorySize, String operatingSystem, double weightOfLaptop, String colourOfLaptop, double averageBatteryLife, double priceOfLaptop) {
        this.brand = brand;
        this.screenDisplaySize = screenDisplaySize;
        this.matrixType = matrixType;
        this.hardDriveSize = hardDriveSize;
        this.processorBrand = processorBrand;
        this.graphicsCardRAMSize= graphicsCardRAMSize;
        this.RAMMemorySize = RAMMemorySize;
        this.operatingSystem = operatingSystem;
        this.weightOfLaptop = weightOfLaptop;
        this.colourOfLaptop = colourOfLaptop;
        //this.averageBatteryLife = averageBatteryLife;
        //this.priceOfLaptop = priceOfLaptop;
    }
// Создание методов get\set Для работы с private полями
    public String getBrand() {return brand;}
    public double getScreenDisplaySize() {return screenDisplaySize;}
    public String getmatrixType() {return matrixType;}
    public int getHardDriveSize() {return hardDriveSize;}
    public Integer getRAMMemorySize(){
        return RAMMemorySize;
    }
    public String getProcessorBrand() {return processorBrand;}
    public String getOperatingSystem() {return operatingSystem;}

    public double getWeightOfLaptop() {return weightOfLaptop;}
    public String getColourOfLaptop() {return colourOfLaptop;}


// Создание метода для создания экземпляра другого класса,
// для того что бы работать с этими экземпляррами в данном классе
    public void addBrand(Brand brand) {
        brands.add(brand);
    }
// создание метода фильтрации ноутбуков по критериям
    public List<Laptop> filter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Здрасвуйте, Укажите каие параметры для ноут бука вы бы хотели иметь." +
                "\nУкажите размер жёсткого диска в гб\nВналичии : 128, 256, 512, 1000, 2000");
        String enterHardDisk = scan.nextLine();
        int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
        System.out.println("Укажите количество оперативной памяти в Гб\nВналичии : 2, 4, 8, 16, 32  ");
        String enterOperativeMemory = scan.nextLine();
        System.out.println("Укажите операционную систему\nВналичии : Linux, Mac OS, Windows, NO OS");
        String enterBrand = scan.nextLine();
        System.out.println("Укажите марку ноутбука\nВналичии : Acer, Asus, Honor, Apple, MSI, Lenovo, Dell, Maibenben");
        String enterProcessorBrand = scan.nextLine();
        System.out.println("Укажите производителя процессора\nВналичии : AMD, Intel, Apple M1");
        String enterMatrixType = scan.nextLine();
        System.out.println("Укажите тип матрицы\nВналичии : TN, IPS, Retina");
        String enterOperatingSystem = scan.nextLine();
        System.out.println("Укажите цвет ноутбука\nВналичии : black, white, silver, red");
        String enterColor = scan.nextLine();

        List<Laptop> listLaptop = new ArrayList<>();
        for (Laptop tempLaptop : laptop) {
            if (intParseEnterHardDisk == tempLaptop.hardDriveSize) {
                if (enterOperativeMemory.equals(tempLaptop.RAMMemorySize)) {
                    if (enterOperatingSystem.equals(tempLaptop.operatingSystem)) {
                        if (enterColor.equals(tempLaptop.colourOfLaptop)) {
                            if (enterBrand.equals(tempLaptop.brand)) {
                                if (enterProcessorBrand.equals(tempLaptop.processorBrand)) {
                                    if (enterMatrixType.equals(tempLaptop.matrixType)) {
                                        listLaptop.add(tempLaptop);
                                    }
                                }

                            }
                        }
                    }
                }
            }

        }
        return listLaptop;
    }
// создание метода фильтрации ноутбуков по выборочной критериям
    public Set<Laptop> newFilter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        Set<Laptop> listLaptop = new HashSet<>(laptop);

        System.out.println("Здрасвуйте, Укажите номер или номера критериев фильрации ноутбуков," + 
        "\n1. Hard drive size\n2. RAM Memory size\n3. Operating system\n4. Colour of laptop\n5. Brand of Laptop\n6. Brand of Processor\n7. Matrix Type");
        String userRequest = scan.nextLine();
            
        for (int i = 0; i < userRequest.length(); i++) {
            if(1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите размер жёсткого диска в гб\nВналичии : 128, 256, 512, 1000, 2000");
                String enterHardDisk = scan.nextLine();
                int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
                for (Laptop tempLaptop : laptop) {
                    if (intParseEnterHardDisk != tempLaptop.hardDriveSize){
                        listLaptop.remove(tempLaptop);
                    }
                }          
            }
            
            if(2 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите количество оперативной памяти в Гб\nВналичии : 2, 4, 8, 16, 32 ");
                String enterRAMMemorySize = scan.nextLine();
                int intParseenterRAMMemorySize = Integer.parseInt(enterRAMMemorySize);
                for (Laptop tempLaptop : laptop) {
                    if ((intParseenterRAMMemorySize != tempLaptop.RAMMemorySize)) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }   

            if(3 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите операционную систему\nВналичии : Linux, Mac OS, Windows, NO OS");
                String enterOperatingSystem = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOperatingSystem.equals(tempLaptop.operatingSystem) == false)) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        
            if(4 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите цвет ноутбука\nВналичии : black, white, silver, red");
                String enterColor = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterColor.equals(tempLaptop.colourOfLaptop)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
            if(5 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите марку ноутбука\nВналичии : Acer, Asus, Honor, Apple, MSI, Lenovo, Dell, Maibenben");
                String enterBrand = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterBrand.equals(tempLaptop.brand)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
            if(6 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите производителя процессора\nВналичии : AMD, Intel, Apple M1");
                String enterProcessorBrand = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterProcessorBrand.equals(tempLaptop.processorBrand)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
            if(7 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите тип матрицы\nВналичии : TN, IPS, Retina");
                String enterMatrixType = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterMatrixType.equals(tempLaptop.matrixType)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        }
        return listLaptop;
    }

// метод toString, выводит на экран данные объекта
    @Override
    public String toString() {
        return "\nLaptop  ->  " + brand + "\nScreen Display Size = " + screenDisplaySize + ",\nMatrix Type = "
                + matrixType
                + ",\nProcessor Brand = " + processorBrand + ",\nHard drive size = " + hardDriveSize + " GB" + ",\nRAM Memory Size = " + RAMMemorySize + " GB" +
                 ",\nOperating system = " + operatingSystem + ",\nColour = " + colourOfLaptop + "\n";
    }

}