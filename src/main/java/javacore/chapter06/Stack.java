//В этом классе определяется целочисленный стек, в котором
// можно хранить до 10 целочисленных значений

package javacore.chapter06;

public class Stack {
    int stck [ ] = new int [ 10 ] ;
    int tos ;
// инициализировать вершину стека
    Stack ( ) {
        tos = -1;
    }
        // разместить элемент в стеке
        void push ( int item) {
            if (tos == 9)
                System.out.println("Cтeк заполнен . ");
            else
                stck[++tos] = item;
        }
            // извлечь элемент из стека
            int рор () {
                if (tos < 0) {
                    System.out.println("Cтeк не загружен . ");
                    return 0;
                } else
                    return stck[tos--];
            }
        }