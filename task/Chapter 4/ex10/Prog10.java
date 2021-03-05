/*
 * Воспользуйтесь примером кода из раздела 4.5.1 для перечисления всех мето-
 * дов из класса типа i n t [ ] . В качестве дополнительного задания можете выявить
 *
 * один метод, обсуждавшийся в этой главе, как неверно описанный.
 */

import java.lang.reflect.Method;
import java.util.Arrays;

public class Prog10 {
    public static void main(String[] args) {
        Class<Arrays> ac = java.util.Arrays.class;
        Method[] am = ac.getDeclaredMethods();
        for (Method method : am) {
            System.out.println("A has " + method.getName());
        }
    }
}
