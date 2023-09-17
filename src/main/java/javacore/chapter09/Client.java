package javacore.chapter09;

public class Client implements Callback {
    // реализовать интерфейс Callback

    @Override
    public void callback(int p) {
        System . out . println ("Метод callback ( ) , вызываеNЫЙ со значением " + p ) ;
    }
}
