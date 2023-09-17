// Если класс включает в себя интерфейс, но не полностью реализует определен-
// ные в нем методы, он должен быть объявлен как abstract
package javacore.chapter09;

abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);

    }
}
