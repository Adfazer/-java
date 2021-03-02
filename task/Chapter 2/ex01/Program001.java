import java.time.DayOfWeek;
import java.time.LocalDate;

/*
 * Измените представленную в этой главе программу вывода календаря таким об-
 * разом, чтобы неделя начиналась с воскресенья. Кроме того, организуйте пере-
 * вод на новую строку в конце предыдущей, но только один раз. ??????????
 */
public class Program001 {
    public static void main(String[] args) {
        int year = 2021;
        int month = 3;
        LocalDate date = LocalDate.of(year, month, 1);
        int flag = 1;
        int flag_n = 1;
        while (date.getMonthValue() == month) {
            DayOfWeek weekday = date.getDayOfWeek();
            int value = weekday.getValue();
            if (flag == 1) {
                for (int i = 0; i < 3 * value; i++)
                    System.out.print(" ");
                flag = 0;
            }
            System.out .printf ("%3d", date.getDayOfMonth()) ;
            if (value == 6 && flag_n == 1) {
                System.out.println("\n");
                flag_n = 0;
            }
            date = date.plusDays(1);
        }

//        int year = 2021;
//        int month = 3;
//        LocalDate date = LocalDate.of(year, month, 1);
//        int flag = 1;
//        while (date.getMonthValue() == month) {
//            DayOfWeek weekday = date.getDayOfWeek();
//            int value = weekday.getValue();
//            if (flag == 1) {
//                for (int i = 0; i < 3 * (value - 1); i++)
//                    System.out.print(" ");
//                flag = 0;
//            }
//            System.out .printf ("%3d", date.getDayOfMonth()) ;
//            if (value == 7)
//                System.out.println("\n");
//            date = date.plusDays(1);
//        }
    }
}
