// Исполь зовать метод по умолчанию getNumber ( ) и getString ( )

package javacore.chapter09;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFimp obj = new MyIFimp();
// Метод qetNumber ( ) можно вызвать , т . к . он явно реализован
// в классе МyIFimp :
        System.out.println(obj.getNumber());
// Метод getStrinq ( ) также можно вызвать , т . к . в интерфейсе
// имеется его реализация по умолчанию :

        System.out.println(obj.getString());
    }
}
// 100
// Объект типа String по умолчанию