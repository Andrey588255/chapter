// метод callback ( ) вызывается через перeменную ссьшки на интерфейс

package javacore.chapter09;

public class TestIface {
    public static void main(String args[]) {
        Callback c = new Client();
        c.callback(42);
    }
}
// Метод callback ( ) , вызываеNЫЙ со значением 42