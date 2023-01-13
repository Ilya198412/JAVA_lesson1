package FinalWork;

import java.util.Scanner;
// Создание класса NoteBook
public class NoteBook {
    // Создание поля на основе другого класса
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
    public NoteBook(){

    }
    // Создание конструктора для создания экземпляров класса
    public NoteBook(String brand, double screenDisplaySize, String matrixType, int hardDriveSize, String processorBrand, int graphicsCardRAMSize,
    int RAMMemorySize, String operatingSystem, double weightOfLaptop, String colorOfLaptop, double averageBatteryLife, double priceOfLaptop){
        this.brand = brand;
        this.screenDisplaySize = screenDisplaySize;
        this.matrixType = matrixType;
        this.hardDriveSize = hardDriveSize;
        this.processorBrand = processorBrand;
        this.graphicsCardRAMSize= graphicsCardRAMSize;
        this.RAMMemorySize = RAMMemorySize;
        this.operatingSystem = operatingSystem;
        this.weightOfLaptop = weightOfLaptop;
        this.colourOfLaptop = colorOfLaptop;
        this.averageBatteryLife = averageBatteryLife;
        this.priceOfLaptop = priceOfLaptop;


    }


    // Создание методов get\set Для работы с private полями
    public  String getColour() {return colourOfLaptop;}

    public String getBrand(){return brand;}
    public String getMatrixType(){
        return matrixType;
    }

    public Double getScreenDisplaySize(){
        return screenDisplaySize;
    }
    public Integer getHardDriveSize(){return hardDriveSize;}
    public String getProcessorBrand(){
        return processorBrand;
    }
    public Integer getGraphicsCardRAMSize(){
        return graphicsCardRAMSize;
    }
    public Integer getRAMMemorySize(){
        return RAMMemorySize;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }
    public Double getWeightOfLaptop(){
        return weightOfLaptop;
    }
    public double getAverageBatteryLife(){
        return averageBatteryLife;
    }
    public double getPriceOfLaptop(){
        return priceOfLaptop;
    }


    public void printInfo() {
        System.out.printf("Производитель ноутбука: %s, размер дисплея: %s, тип матрицы: %s, объем жесткого диска: %s ГБ, производитель процессора: %s,%n" +
                "объем видеопамяти: %s МБ, объем оперативной памяти: %s ГБ, операционная система: %s, вес ноутбука: %s КГ,%nцвет ноутбука: %s, " +
                "время работы от аккумулятора: %s часов, цена ноутбука: %s рублей %n%n", brand, screenDisplaySize,
                matrixType, hardDriveSize, processorBrand, graphicsCardRAMSize, RAMMemorySize, operatingSystem, weightOfLaptop,
                colourOfLaptop, averageBatteryLife, priceOfLaptop);
    }
    // метод toString, выводит на экран данные объекта
//    @Override
//    public String toString(){
//        return String.format("Производитель ноутбука: %s, размер дисплея: %s, тип матрицы: %s, объем жесткого диска: %s ГБ, производитель процессора: %s,%n" +
//                "объем видеопамяти: %s МБ, объем оперативной памяти: %s ГБ, операционная система: %s, вес ноутбука: %s КГ,%nцвет ноутбука: %s, " +
//                "время работы от аккумулятора: %s часов, цена ноутбука: %s рублей %n%n", brand, screenDisplaySize,
//                matrixType, hardDriveSize, processorBrand, graphicsCardRAMSize, RAMMemorySize, operatingSystem, weightOfLaptop,
//                colourOfLaptop, averageBatteryLife, processorBrandiceOfLaptop);
    //}
    @Override
    public String toString(){
        return "Производитель ноутбука:" + brand + ", размер дисплея:" + screenDisplaySize + ", тип матрицы:" + matrixType +
                ", объем жесткого диска:" + hardDriveSize + ", производитель процессора:" + processorBrand + ", объем видеопамяти:"
                + graphicsCardRAMSize + ", объем оперативной памяти:" + RAMMemorySize + ", операционная система: " + operatingSystem +
                ", вес ноутбука:" + weightOfLaptop + ", цвет ноутбука:" + colourOfLaptop + ", время работы от аккумулятора: "
                + averageBatteryLife + ", цена ноутбука:" + priceOfLaptop +"\n";
    }
}