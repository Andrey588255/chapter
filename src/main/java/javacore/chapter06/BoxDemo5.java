package javacore.chapter06;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        // инициализировать каждый экземпляр класса ВОх
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3,6, 9);
        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Oбъeм равен" + vol);
        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм равен" + vol);
    }
}
//Oбъeм равен3000.0
//Oбъeм равен162.0
