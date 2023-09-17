// Усовершенствованный класс Stack , в котором
// исполь зован член длины массива

package javacore.chapter07;

public class Stack {
    private int stck[];
    private int tos;

    // выделить память под стек и инициализировать его
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разметить элемент в стеке
    void push(int item) {
        if (tos == stck.length - 1) // использовать член длины массива
            System.out.println("Cтeк заполнен . ");
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    int рор() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен . ");
            return 0;
        } else
            return stck[tos--];
    }
}
                class TestStack2 {
                    public static void main(String[] args) {
                        Stack mystack1 = new Stack(5);
                        Stack mystack2 = new Stack(8);

                        // разместить числа в стеке
                        for (int i = 0; i < 5; i++) mystack1.push(i);
                        for (int i = 0; i < 8; i++) mystack2.push(i);
                        // извлечь эти числа из стека
                        System.out.println("Cтeк в mystack1 : ");
                        for (int i = 0; i < 5; i++) ;
                        System.out.println(mystack1.рор());
                        System.out.println("Cтeк в mystack2 : ");
                        for (int i = 0; i < 8; i++)
                            System.out.println(mystack1.рор());
                    }
                }
                //Cтeк в mystack1 :
//4
//Cтeк в mystack2 :
//3
//2
//1
//0
//Cтeк не загружен .
//0
//Cтeк не загружен .
//0
//Cтeк не загружен .
//0
//Cтeк не загружен .
//0
