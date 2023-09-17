package javacore.chapter08;

public class classA {
    int i, j;

    void showij() {
        System.out.println(" i и j : " + i + " " + j);
        // создать подкласс путем расширения класса А
    }
}
        class B extends classA {
            int k;

            void showk() {
                System.out.println(" k : " + k);
            }

            void sum() {
                System.out.println(" i+j + k : " + (i + j + k));

            }

            public void show() {
            }

            public void callmetoo() {
            }
        }
        class Simpleinheritance {
            public static void main(String[] args) {
                classA superOb = new classA();
                B subOb = new B();
// суперкласс может исполь зоваться самостоятельно
                superOb.i = 10;
                superOb.j = 20;
                System.out.println("Coдepжимoe объекта superOb : ");
                superOb.showij();
                System.out.println();
// Подкласс имеет доступ ко всем открытым членам
// своего суперкласса . * /
                subOb.i = 7;
                subOb.j = 8;
                subOb.k = 9;
                System.out.println("Coдepжимoe объекта subOb : ");
                subOb.showij();
                subOb.showk();
                System.out.println();
                System.out.println("Cyммa i , j и k в объекте subOb : ");
                subOb.sum();
            }
        }
    // Coдepжимoe объекта superOb :
// i и j : 10 20
//
//Coдepжимoe объекта subOb :
// i и j : 7 8
// k : 9
//
//Cyммa i , j и k в объекте subOb :
// i+j + k : 24



