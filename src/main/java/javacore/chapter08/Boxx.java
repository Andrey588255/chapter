// Расширение класса BoxWeiqht включением в него
// поля стоимости доставки

package javacore.chapter08;

import javax.swing.*;

public class Boxx {
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта
    Boxx(Boxx ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор , применяемый при указании всех размеров
    Boxx(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор ,применяемый в отсутствие размеров
    Boxx() {
        width = -1; // значение -1 служит для обозначения
        height = -1;  // неинициализированного
        depth = -1;   // параллелепипеда
    }

    // конструктор, применяемый при создании куба
    Boxx(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
                // добавить поле веса
                class BoxWeight extends Вох {
                    double weight; // вес параллелепипеда

                    // сконструировать клон объекта
                    BoxWeight(BoxWeight ob) { // передать объект конструктору
                        super(ob);
                        weight = ob.weight;
                    }

                    // конструктор, применяемый при указании всех параметров
                    BoxWeight(double w, double h, double d, double m) {
                        super(w, h, d); // вызвать конструктор суnеркласса
                        weight = m;
                    }

                    // конструктор , применяемый по умолчанию
                    BoxWeight() {
                        super();
                        weight = -1;
                    }

                    // конструктор , применяемый при создании куба
                    BoxWeight(double len, double m) {
                        super();
                        weight = m;
                    }
                }
                                // добавить поле стоимости доставки
                                class Shipment extends BoxWeight {
                                    double cost;

                                    // сконструировать клон объекта
                                    Shipment(Shipment ob) { // передать объект конструктору
                                        super(ob);
                                        cost = ob.cost;
                                    }

                                    // конструктор , используемый при указании всех параметров
                                    Shipment(double w, double h, double d,
                                             double m, double c) {
                                        super(w, h, d, m); // вызвать конструктор суперкласса
                                        cost = c;
                                    }

                                    // конструктор, применяемый п о умолчанию
                                    Shipment() {
                                        super();
                                        cost = -1;
                                    }

                                    // конструктор , применяемый при создании куба
                                    Shipment(double len, double m, double c) {
                                        super(len, m);
                                        cost = c;
                                    }
                                }

class DemoShipment {
    public static void main(String args[]) {
        Shipment shipment1 =
                new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 =
                new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Oбъeм shipment1 равен " + vol);
        System.out.println("Bec shipment1 равен " + shipment1.weight);
        System.out.println("Cтoимocть доставки : $ " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Oбъeм shipment2 равен " + vol);
        System.out.println("Bec shipment2 равен " + shipment2.weight);
        System.out.println("Cтoимocть доставки : $ " + shipment2.cost);
    }
}
// Oбъeм shipment1 равен 3000.0
// Bec shipment1 равен 10.0
// Cтoимocть доставки : $ 3.41
// Oбъeм shipment2 равен 24.0
// Bec shipment2 равен 0.76
// Cтoимocть доставки : $ 1.28
