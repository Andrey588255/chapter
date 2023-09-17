// Вывести все аргументы командной строки

package javacore.chapter07;

public class CommandLine {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++)
            System.out.println("args [ " + i + " ] : " + args[i]);
    }
}
// java CommandLine this is а test 100 -1
//В итоге будет выведен следующий результат:
//args [ O ] : thi s
//args [ l ] : is
//args ( 2 ] : а
//args ( З ] : test
