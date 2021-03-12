/*
 * С учетом метода из предыдущего упражнения рассмотрите следующий метод:
 * public static <Т> void maxmin(List<T> elements,
 * Comparator<? super T> comp, List<? super T> result) {
 * minmax(elements, comp, result);
 * Lists.swapHelper(result, 0, 1);
 * }
 *
 * Почему этот метод нельзя скомпилировать без захвата подстановки? Подсказка:
 * попробуйте предоставить явный тип L i s t s . <____> s w a p H e lp e r ( r e s u l t , 0, 1). ????????????/
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class P13 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(new Random().nextInt(100));
            System.out.println(arrayList.get(i));
        }
        List<Integer> result = new ArrayList<>();
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        P12.minmax(arrayList, comparator, result);
//        List.swapHelper(result, 0, 1); ???????????????????
    }
}
