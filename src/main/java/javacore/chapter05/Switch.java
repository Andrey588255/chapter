// Усовершенствованная версия программы, в которой
// определяется принадлежность месяца времени года
package javacore.chapter05;

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "эиме ";
                break;
            case 3:
            case 4:
            case 5:
                season = "весне";
                break;
            case 6:
            case 7:
            case 8:
                season =  "лету";
                break;
            case 9:
            case 10:
            case 11:
                season =   "осени";
                break;
            default:
                season =  "вЬ1МЫ1ПЛенным месяцам";

        }
        System.out.println("Aпpeль относится к" + season + " . "); // Aпpeль относится к весне
    }
}
