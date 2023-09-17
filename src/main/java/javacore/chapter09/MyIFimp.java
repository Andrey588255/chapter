package javacore.chapter09;

public class MyIFimp implements MyIF {
    // В этом классе должен быть реализован только метод qetNumber ( )
    // определенный в интерфейсе МyIF .
    // А вызов метода qetString ( ) разрешается по умолчанию
    public int getNumber() {
        return 100;
    }
}
