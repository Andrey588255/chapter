package javacore.chapter09;

import javacore.chapter08.Вох;

// Теперь в классе BoXWeiqht ключевое слово super используется
// для инициализации собственных свойств объекта типа Вох
class BoxWeight extends Вох {
    double weight; // вес параллелепипеда

    // инициализировать поля width, heiqht и depth
// с помощью метода super ( )
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // вызвать конструктор суперкласса
    }
}