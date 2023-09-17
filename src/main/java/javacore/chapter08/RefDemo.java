//
package javacore.chapter08;

public class RefDemo {
    public static void main(String[] args) {

        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Вох plainbox = new Вох();
        double vol;
        vol = weightbox.volume();
        System.out.println("Oбъeм weightbox равен " + vol);
        System.out.println("Bec weightbox равен " + weightbox.weight);
        System.out.println();

// nрисвоить ссылке на объект ВO:itWeight ссылки на объект ВОх
        plainbox = weightbox;
        vol = plainbox.volume(); // Верно, т.к. метод volume()
        // определен в классе Вох
        System.out.println("Oбъeм plainbox равен " + vol);
    }
}
// Следующий оператор ошибочен , поскольку член plainЬox
// не определяет член veight . * /
// Sys tem . out . println ( "Bec plainbox равен " + plainbox . weight ) ;

// бъeм weightbox равен 105.0
//Bec weightbox равен 8.37
//
//Oбъeм plainbox равен 105.0
