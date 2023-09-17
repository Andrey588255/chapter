//В этой версии класса Вох один объект допускается
//инициализировать другим объектом

package javacore.chapter07;

public class Box1 {
    double width;
    double height;
    double depth;

    // Обратите внимание на этот конструктор .
    // В качестве параметра в нем используется объект типа Вох
    Box1(Box1 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор , исполь зуемый при указании всех размеров
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
        // конструктор , исполь зуемый , если ни один из размеров не указан
        Box1() {
            width = -1; // использовать значение - 1 для обозначения
            height = -1; // неинициализированного
            depth = -1; // параллелепипеда
        }
        // конструктор , исполь зуемый при создании куба
        Box1( double len){
            width = height = depth = len;
        }
        // рассчитать и возвратить объем
        double volume () {
            return width * height * depth;
        }
    }

    class OverloadCons2 {
        public static void main(String[] args) {

            // создать параллелепипеды, исполь зуя
            // разные конструкторы
            Box1 mybox1 = new Box1(10, 20, 15);
            Box1 mybox2 = new Box1();
            Box1 mycube = new Box1(7);
            Box1 myclone = new Box1(mybox1);
            // создать копию объекта JDYЬoxl
            double vol;
            // получить объем первого параллелепипеда
            vol = mybox1.volume();
            System.out.println("Oбъeм myboxl равен " + vol);
            // получить объем второго параллелепипеда
            vol = mybox2.volume();
            System.out.println("Oбъeм mybox2 равен " + vol);
            // получить объем куба
            vol = mycube.volume();
            System.out.println("Oбъeм куба равен " + vol);
            // получить объем клона
            vol = myclone.volume();
            System.out.println("Oбъeм клона равен " + vol);
        }
    }
// Oбъeм myboxl равен 3000.0
//Oбъeм mybox2 равен -1.0
//Oбъeм куба равен 343.0
//Oбъeм клона равен 3000.0
