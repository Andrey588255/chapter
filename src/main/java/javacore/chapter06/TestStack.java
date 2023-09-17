package javacore.chapter06;

public class TestStack {
    public static void main(String[] args) {

        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

// разместить числа в стеке
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);
// извлечь эти числа из сте ка
        System.out.println("Coдepжимoe стека mystack1 : ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.рор());
        System.out.println("Coдepжимoe стека mystack2 : ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.рор());
    }
}
//Coдepжимoe стека mystack1 :
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
//Coдepжимoe стека mystack2 :
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
