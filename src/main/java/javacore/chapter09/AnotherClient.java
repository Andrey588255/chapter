// одна реализация интерфейса Callback
package javacore.chapter09;

public class AnotherClient implements Callback {
    // реализовать интерфейс CallЬack
    public void callback(int p) {
        System.out.println("Eщe один вариант метода callback ( ) ");
        System.out.println("p в квадрате равно " + (p * p));

    }
}
