/*
 * Напишите метод i n t m in ( i n t [] v a lu e s ) , в котором перед возвратом наимень-
 * шего значения утверждается, что оно действительно не больше всех остальных
 *
 * значений в массиве. Воспользуйтесь вспомогательным методом или же мето-
 * дом S tre a m . a llM a t c h (), если вы уже просматривали материал главы 8. Орга-
 * низуйте повторный вызов данного метода для обработки крупного массива и
 *
 * определите время выполнения кода при разрешении, запрете и исключении
 * утверждений.
 */


import java.util.Arrays;

public class Pr12 {
    public static void main(String[] args) {
        int[] a = {1, -8, 16, 0, 3};
        System.out.println(min(a));
    }

    public static int min(int[] values) {
        int asInt = Arrays.stream(values).min().getAsInt();
        for (int i = 0; i < values.length; i++) {
            assert asInt <= values[i];
        }
        return asInt;
    }
}
