package javacore.chapter07;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {

        Stack mystack1 = new Stack<>();
        Stack mystack2 = new Stack<>();
// разместить числа в стеке
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);
// извлечь эти числа из стека
        System.out.println("Cтeк в mystack1 : ");
        ;
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());
        ;
        System.out.println("Cтeк в mystack2 : ");
        ;
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
        ;
// эти операторы недопустимы
// mystack1.tos = - 2 ;
// mystack2.stck [ З ] = 100 ;
    }
}
//Cтeк в mystackl :
//9
//8
//7
//6
//5
//4
//3
//2
//1
//0
//Cтeк в mystack2 :
//19
//18
//17
//16
//15
//14
//13
//12
//11
//10
