//Применение оператора break в качестве цивилизованной
// формы оператора qoto

package javacore.chapter05;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println("Пpeдшecтвyeт оператору break . ");
                    if (t) break second; // выход из блока second
                    System.out.println("Этoт оператор не будет выполняться");
                }
                System.out.println("Этoт оператор не будет выполняться");
            }
            System.out.println("Этoт оператор следует за блоком second . ");
        }
    }
}
//Пpeдшecтвyeт оператору break .
//Этoт оператор следует за блоком second .
