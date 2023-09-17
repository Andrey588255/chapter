// Полная реализация класса ВoxWeight

package javacore.Box;

public class Box {
    private double width ;
    private double height ;
    private double depth;
// сконструировать клон объекта
    Box(Box ob ) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
// конструктор , применяемый при указании всех размеров
        Box ( double w , double h , double d ) {
            width = w;
            height = h;
            depth = d;
        }
            // конструктор, применяемый в отсутствие размеров
            Box() {
                width = -1; // значение -1 служит для обозначения
                height = -1; // неинициализированного
                depth = -1; // параллелепипеда
            }
            // конструктор, применяемый при создании куба
            Box( double len){
                width = height = depth = len;
                // рассчитать и возвратить объем
            }
        }

        // Теперь в классе ВoxWeight полностью реализованы все конструкторы
class BoxWeight extends Box {
    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    BoxWeight(BoxWeight ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    // конструктор , применяемый при указании всех параметров
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // вызвать конструктор из суперкласса
        weight = m;
    }

    // конструктор, применяемый по умолчанию
    BoxWeight() {
        super();
        weight = -1;
    }

    // конструктор , применяемый при создании куба
    BoxWeight(double len, double m) {
        super((int) len);
        weight = m;
    }

    public double volume() {
        return 0;
    }
}

class DemoSuper {
    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight(); // по умолчанию
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);

        double vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        System.out.println("Bec mybox1 равен " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();

        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println("Bec mybox2 равен " + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();

        System.out.println("Oбъeм mybox3 равен " + vol);
        System.out.println("Bec mybox3 равен " + mybox3.weight);
        System.out.println();
        vol = myclone.volume();

        System.out.println("Oбъeм myclone равен " + vol);
        System.out.println("Bec myclone равен " + myclone.weight);
        System.out.println();
        vol = mycube.volume();

        System.out.println("Oбъeм mycube равен " + vol);
        System.out.println(" Bec mycube равен " + mycube.weight);
        System.out.println();
    }
}
// Oбъeм mybox1 равен 0.0
//Bec mybox1 равен 34.3
//
//Oбъeм mybox2 равен 0.0
//Bec mybox2 равен 0.076
//
//Oбъeм mybox3 равен 0.0
//Bec mybox3 равен -1.0
//
//Oбъeм myclone равен 0.0
//Bec myclone равен 34.3
//
//Oбъeм mycube равен 0.0
// Bec mycube равен 2.0