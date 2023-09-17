//В данном примере конструкторы определяются в классе Вох для
//инициализации размеров параллелепипеда тремя разными способами

package javacore.chapter07;

public class Box {
    double width;
    double height;
    double depth;

    // конструктор , используемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор ,используемый, когда ни один из размеров не указан
    Box() {
        width = -1;  // исполь зовать значение -1 для обозначения
        height = -1; // неинициализированного
        depth = -1;  // параллелепипеда
    }

    // конструктор , используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
                    class OverloadCons {
                        public static void main(String[] args) {
                            // создать параллелепипеды, исполь зуя разные
                            // конструкторы
                            Box mybox1 = new Box(10, 20, 15);
                            Box mybox2 = new Box();
                            Box mycube = new Box(7);
                            double vol;
                            // получить объем первого параллелепипеда
                            vol = mybox1.volume();
                            System.out.println("Oбъeм myboxl равен " + vol);
                            // получить объем второго параллелепипеда
                            vol = mybox2.volume();
                            System.out.println("Oбъeм mybox2 равен " + vol);
                            // получить объем куба
                            vol = mycube.volume();
                            System.out.println("Oбъeм mycube равен " + vol);
                        }
                    }
                    //Объем myboxl равен 3000 . О
                    //Объем mybox2 равен - 1.О
                    //Объем mycuЬe равен 343.0

