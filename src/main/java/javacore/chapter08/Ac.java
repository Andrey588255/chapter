// Методы с отличающимися сигнатурами считаются
// перегружаемыми, а не переопределяемыми

package javacore.chapter08;

public class Ac {
    int i, j;

    Ac(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i и j
    void show() {
        System.out.println(" i и j : " + i + " " + j);
    }
}
// создать подкласс путем расширения класса А
        class E extends Ac {
    int k;

    E(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // перегрузить метод show ( )
    void show(String msg) {
        System.out.println(msg + k);
    }
}
                class Overrid {
                    public static void main(String args[]) {
                        E subOb = new E(1, 2, 3);
                        subOb.show("Это k : "); // вызвать метод show ( ) из класса В
                        subOb.show(); // вызвать метод show ( ) из класса А

                    }
                }
                // Это k : 3
               // i и j : 1 2
