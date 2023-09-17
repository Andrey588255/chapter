package javacore.chapter09;

public interface IntStackk {
    void push(int item); // сохранить элемент в стеке

    int pop(); // извлечь элемент из стека

    // У метода clear ( ) теперь имеется вариант по умолчанию, поэтому
// его придется реализоваться в том существующем классе , где уже
// применяется интерфейс IntStack
    default void clear() {
        System.out.println("Meтoд clear ( ) не реализован . ");
    }
}
