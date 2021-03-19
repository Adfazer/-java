/*
 * Допустим, что имеется массив i n t [] v a lu e s = { 1, 4, 9, 16 }. Каков результат
 * вызова S t r e a m . o f ( v a lu e s ) ? Как вместо этого получить поток данных типа i n t ?
 */

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PPR3 {
    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16};
        Stream<int[]> values1 = Stream.of(values);
        Arrays.stream(values);
    }
}
