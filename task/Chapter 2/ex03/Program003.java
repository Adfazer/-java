/*
 * Может ли модифицирующий метод вообще возвращать что-нибудь, кроме
 * типа v o id ? Можно ли создать метод доступа с возвращаемым типом v o id , т.е.
 * ничего фактически не возвращающий? Приведите по возможности примеры
 * таких методов.
 */

// например bool

public class Program003 {
    public static void main(String[] args) {
        getVoid();
    }

    public static void getVoid() {
        return;
    }
}
