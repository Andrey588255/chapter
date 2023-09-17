// Определить внутренний класс в цикле for

package javacore.chapter07;

public class Outer1 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println(" вывoд : outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
                class InnerClassDemos {
                    public static void main(String[] args) {
                       Outer1 outer1 = new Outer1();
                        outer1.test();
                    }
                }
// вывoд : outer_x = 100
// вывoд : outer_x = 100
// вывoд : outer_x = 100
// вывoд : outer_x = 100
// вывoд : outer_x = 100
// вывoд : outer_x = 100
// вывoд : outer_x = 100
// вывoд : outer_x = 100
// вывoд : outer_x = 100
// вывoд : outer_x = 100
