// Простой пример абстракции

package javacore.chapter08;

abstract class Q {
    abstract void callme();

    // абстрактные классы все же могут содержать конкре тные методы
    void callmetoo() {
        System.out.println("Этo конкретный метод . ");
    }
}
        class F extends B {
            void callme() {
                System.out.println("Peaлизaция метода callme ( ) из класса В . ");
            }
        }
                class AbstractDemo {
                    public static void main(String args[]) {
                        F f = new F();
                        f.callme();
                        f.callmetoo();
                    }
                }
                // Peaлизaция метода callme ( ) из класса В
