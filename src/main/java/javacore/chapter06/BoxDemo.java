//В этом классе объявляется объект тиnа Вох

package javacore.chapter06;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();

        double vol;
// присвоить значение переменным экземпляра шуЬох
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
// рассчитать объем параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Oбъeм равен " + vol);
    }
}
//Oбъeм равен 3000.0