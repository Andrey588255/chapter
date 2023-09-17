// Переопределение метода

package javacore.chapter08;

public class Ab {
    int i, j;

    Ab(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i и j
    void show() {
        System.out.println(" i и j : " + i + " " + j);
    }
}
            class D extends Ab {
                int k;

                D(int a, int b, int c) {
                    super(a, b);
                    k = c;
                }

                // вывести содержимое переменной k с помощью метода ,
                // переопределяющего метод show () из класса А
                void show() {
                    System.out.println(" k : " + k);
                }
            }
                        class Override {
                            public static void main(String args[]) {
                                D subOb = new D(1, 2, 3);
                                subOb.show(); // здесь вызывается метод show ( ) из класса В
                            }
                        }
//  k : 3