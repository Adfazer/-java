/*
 * Реализуйте статический метод c o n s t a n t () из интерфейса In t S e q u e n c e , возвра-
 * щающий бесконечную последовательность констант. Например, в результате
 *
 * вызова I n t S e q u e n c e . c o n s t a n t ( 1) возвращается бесконечная последователь-
 * ность 111. . .. В качестве дополнительного задания сделайте то же самое с
 *
 * помощью лямбда-выражения. ?????????????
 */

public class Program5 {
    public static void main(String[] args) {
        System.out.println(IntSequence.constante(1));
        IntSequenceLambda intSequenceLambda = (x)->x;
        System.out.println(intSequenceLambda.constante(2));
    }
}
