// Применение полиморфизма во время выполнения

package javacore.chapter08;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Плoщaдь фигуры не определена . ");
        ;
        return 0;
    }
}
            class Rectangle extends Figure {
                Rectangle(double a, double b) {
                    super(a, b);
                }

                // переопределить метод area ( ) для четырехугольника
                double area() {
                    System.out.println("B области четырехугольника . ");
                    return dim1 * dim2;
                }
            }
                    class Triangle extends Figure {
                        Triangle(double a, double b) {
                            super(a, b);
                        }

                        // переопределить метод area ( ) для прямоугольного треугольника
                        double area() {
                            System.out.println(" B области треугольника . ");
                            return dim1 * dim2 / 2;
                        }
                    }
                            class FindAreas {
                                public static void main(String[] args) {
                                    Figure f = new Figure(10, 10);
                                    Rectangle r = new Rectangle(9, 5);
                                    Triangle t = new Triangle(10, 8);
                                    Figure figref;

                                    figref = r;
                                    System.out.println("Плoщaдь равна " + figref.area());
                                    figref = t;
                                    System.out.println("Плoщaдь равна " + figref.area());
                                    figref = f;
                                    System.out.println("Плoщaдь равна " + figref.area());
                                }
                            }
                            // B области четырехугольника .
//Плoщaдь равна 45.0
// B области треугольника .
//Плoщaдь равна 40.0
//Плoщaдь фигуры не определена .
//Плoщaдь равна 0.0
