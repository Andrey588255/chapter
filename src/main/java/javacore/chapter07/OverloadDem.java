package javacore.chapter07;

public class OverloadDem {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют ");
    }

    // Перегружаемый метод , проверяющий наличие
    // одного целочисленного параметра
    void test(int a) {
        System.out.println(" a : " + a);
    }

    // Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println(" a и b : " + a + " " + b);
    }

    // Перегружаемый метод , проверяющий наличие
    // параметра типа double
    double test(double a) {
        System.out.println(" double а : " + a);
        return a * a;
    }
}
class Overload {
    public static void main(String[] args) {

        OverloadDem ob = new OverloadDem();
        double result;
        // вызвать все варианты метода tsвt ( )
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println(" Peзyльтaт вызова ob.test ( 12 3.25 } : " + result);
    }
}
//Пapaмeтpы отсутствуют
// a : 10
// a и b : 10 20
// double а : 123.25
// Peзyльтaт вызова ob.test ( 12 3.25 } : 15190.5625
