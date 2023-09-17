// Применить автоматическое преобразование типов к перегрузке

package javacore.chapter07;

  class OverloadDemo {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют ");
    }

    // Перегружаемый метод , проверяющий наличие наличие
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println(" a и b : " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    // параметра типа double
    void test(double a) {
        System.out.println(" Внутреннее преобразование при вызове test ( double ) а : " + a);
    }

    static class Overload {
        public static void main(String[] args) {
            OverloadDemo ob = new OverloadDemo();
            int i = 88;
            ob.test();
            ob.test(10, 20);
            ob.test(i); // здесь вызывается вариант метода test (double)
            ob.test(123.2); // а здесь вызывается вариант метода test (douЬle)

        }
    }
}
// Пapaмeтpы отсутствуют
// a и b : 10 20
// Внутреннее преобразование при вызове test ( double ) а : 88.0
// Внутреннее преобразование при вызове test ( double ) а : 123.2
