// Реализация интерфейса IntStack для стека фиксированного размера

package javacore.chapter09;

    class FixedStack implements IntStack {
        private int stck[];
        private int tos;

        // выделить память и инициализировать стек
        FixedStack(int size) {
            stck = new int[size];
            tos = -1;
        }

        // разместить элемент в стеке
        public void push(int item) {
            if (tos == stck.length - 1) // использовать поле длины стека
                System.out.println("Cтeк заполнен . ");
            else
                stck[++tos] = item;
        }

        // извлечь элемент из стека
        public int pop() {
            if (tos < 0) {
                System.out.println("Cтeк не загружен . ");
                return 0;
            } else
                return stck[tos--];
        }
    }

    class IFТest {
        public static void main(String[] args) {
            FixedStack mystack1 = new FixedStack(5);
            FixedStack mystack2 = new FixedStack(8);
            // разместить числа в стеке
            for (int i = 0; i < 5; i++) mystack1.push(i);
            for (int i = 0; i < 8; i++) mystack2.push(i);
            // извлечь эти числа из стека

            System.out.println("Cтeк в mystackl : ");
            for (int i = 0; i < 5; i++)
                System.out.println(mystack1.pop());
            System.out.println("Cтeк в mystack2 : ");
            for (int i = 0; i < 8; i++)
                System.out.println (mystack2.pop());
        }
    }
// Cтeк в mystackl :
//4
//3
//2
//1
//0
//Cтeк в mystack2 :
//7
//6
//5
//4
//3
//2
//1
//0
