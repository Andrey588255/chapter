package javacore.chapter06;

public class BoxDemo7 {
    public static void main(String[] args) {

        // объявить , выделить память и инициализировать объекты типа Вох
        Box mybox1 = new Box () ;
        Box mybox2 = new Box () ;
        double vol ;
        // nолучить объем первого параллелепипеда
        vol = mybox1.volume ( ) ;
        System.out.println ( "Oбъeм равен " + vol ) ;
        // получить объем второго параллелепипеда
        vol = mybox2.volume ( ) ;
        System.out.println ( "Oбъeм равен " + vol ) ;
    }
}
//Koнcтpyиpoвaниe объекта Вох
// Koнcтpyиpoвaниe объекта Вох
//Oбъeм равен 3000.0
//Oбъeм равен 162.0
