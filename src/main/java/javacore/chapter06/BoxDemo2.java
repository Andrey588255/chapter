package javacore.chapter06;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        // присвоить значения переменным экземпляра myЬoxl
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
// * присвоить другие значения переменным
        //экземпляра шуЬох2 * /
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // рассчитать объем первого параллелепипеда
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Oбъeм равен " + vol);
// рассчитать объем второго параллелепипеда
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Oбъeм равен " + vol);
    }
}
//Oбъeм равен 3000.0
//Oбъeм равен 162.0
