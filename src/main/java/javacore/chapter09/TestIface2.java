// Теперь попробуем создать и опробовать следующий класс:
package javacore.chapter09;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob; // теперь переменная с ссылается на
        // объект типа AnotherClient
        c.callback(42);
    }
}
// Метод callback ( ) , вызываеNЫЙ со значением 42
// Eщe один вариант метода callback ( )
// p в квадрате равно 1764
