//  Продемонстрировать порядок вызова конструкторов

package javacore.chapter08;

public class Aa {
    Aa() {
        System.out.println("B конструкторе А. ");
    }
}
// создать подкласс путем расширения класса А
    class Bb extends A {
    Bb() {
        System.out.println(" B конструкторе В . ");
    }
}
            // создать еще один подкласс путем расширения класса В
            class C extends B {
                C() {
                    System.out.println("B конструкторе С . ");
                }
            }
                    class CallingCons {
                        public static void main(String[] args) {

                            C c = new C();
                        }
                    }
// B конструкторе С