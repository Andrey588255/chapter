// Реализация "наращиваемого" стека
package javacore.chapter09;

public class DynStack implements  IntStack {
    private int stck[];
    private int tos;

    // выделить память и инициализировать стек
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    public void push(int item) {
        // если стек заполнен, выделить память под стек большего размера
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; // удвоить размер стека
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else
            stck[++tos] = item;
    }

    @Override
    public int pop() {
        return 0;
    }

    // извлечь элемент из стека
    public int рор() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен . ");

            return 0;
        } else
            return stck[tos--];
    }
}
                        class IFTest2 {
                            public static void main(String[] args) {
                                DynStack mystack1  = new DynStack(5);
                                DynStack mystack2 = new DynStack(8);
                                // В этих циклах увеличиваются размеры каждого стека
                                for (int i = 0; i < 12; i++) mystack1.push(i);
                                for (int i = 0; i < 20; i++ )mystack2.push(i);
                                System.out.println("Cтeк в mystack1 : ");
                                for (int i = 0; i < 12; i++)
                                    System.out.println(mystack1.pop());
                                System.out.println("Cтeк в mystack2 : ");
                                for (int i = 0; i < 20; i++ )
                                System.out.println(mystack2.pop());
                            }
                        }
                        // Cтeк в mystack1 :
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
//Cтeк в mystack2 :
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
//0
