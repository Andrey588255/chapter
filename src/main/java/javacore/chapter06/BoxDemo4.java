package javacore.chapter06;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        // присвоить значения переменным экземпляра шуЬохl
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
// присвоить другие значения переменным экземпляра шуЬох2 * /
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
// получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Oбъeм равен " + vol);
// получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}
//Oбъeм равен 3000.0
//Oбъeм равен 162.0
