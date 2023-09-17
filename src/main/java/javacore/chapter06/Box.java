package javacore.chapter06;

public class Box {
    double width;
    double height ;
    double depth;
// конструктор , используемый при указании всех размеров
    Box ( double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
        // конструктор , используемый, когда ни один из размеров не указан
                Box ( ) {
            width = -1; // исполь зовать значение -1 для обозначения
            height = -1; // неинициализированного
            depth = -1;   //  параллелепипеда
        }

// конструктор , исполь зуемый при создании куба
            Box ( double len ) {
                width = height = depth = len;
            }
// рассчитать и возвратить объем
                double volume ( ) {
                    return width * height * depth;
    
    }

    public void setDim(int i, int i1, int i2) {
    }
}