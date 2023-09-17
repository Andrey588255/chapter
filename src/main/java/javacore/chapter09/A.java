// Пример вложенного интерфейса
// Этот класс содержит интерфейс как свой член

package javacore.chapter09;

public class A {
    // это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}
        // Класс В реализует вложенный интерфейс
        class В implements A.NestedIF {
            public boolean isNotNegative ( int x ) {
                return x < 0 ? false : true;
                 }

            }
                 class NestedIFDemo {
                        public static void main(String args[]) {
                        // исполь зовать ссылку на вложенный интерфейс
                        A.NestedIF nif = new В();
                        if (nif.isNotNegative(10))
                            System.out.println("Чиcлo 10 неотрицательное ");
                        if (nif.isNotNegative(-12))
                            System.out.println(" Этo не будет выведено");
                    }
                }
                // Чиcлo 10 неотрицательное

  // Обратите внимание на то, что в классе А определяется вложенный интерфейс
// NestedIF, объявленный как public. Затем вложенный интерфейс реализуется
// в классе В следующим образом:
// implements A.NestedIF