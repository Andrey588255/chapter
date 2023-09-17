// Применение абстрактных методов и классов

package javacore.chapter08;

abstract class Figure1 {
    double dim1;
    double dim2;

    Figure1(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // теперь метод area ( ) объявляется абстрактныы
    abstract double area();

    class Rectangle extends Figure1 {
        Rectangle(double a, double b) {
            super(a, b);
        }

        // переопределить метод area ( ) для четырехугольника
        double area() {
            System.out.println("B области четырехугольника . ");
            return dim1 * dim2;
        }
    }

    class Triangle extends Figure1 {
        Triangle(double a, double b) {
            super(a, b);
        }

        // переопределить метод area () для прямоугольного треугольника
        double area() {
            System.out.println(" B области треугольника . ");
            return dim1 * dim2 / 2;
        }
    }

    class AbstractAreas {
        public static void main(String[] args) {
            // Figure f = new Figure ( 10 , 10 ) ; // теперь недопустимо
           // Rectangle r = new Rectangle(9, 5);
            // Triangle t = new Triangle(10, 8);
            Figure figref; // верно , но объект не создается
           // figref = r;
           // System.out.println("Плoщaдь равна " + figref.area());
            //figref = t;
           // System.out.println("Плoщaдь равна " + figref.area());
        }
    }
}