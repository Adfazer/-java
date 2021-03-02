/*
 * Каковы все супертипы для типа S t r i n g , S c a n n e r или Im a g e O u tp u tS tre a m ? Сле-
 * дует иметь в виду, что у каждого типа имеется свой супертип. Класс или ин-
 * терфейс без явно объявленного супертипа имеет супертип O b je c t.
 */

import javax.imageio.stream.ImageOutputStream;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        String string;
        /*
         * public final class String
         *     implements java.io.Serializable, Comparable<String>, CharSequence,
         *                Constable, ConstantDesc {
         */
        Scanner scanner;
        /*
         * public final class Scanner implements Iterator<String>, Closeable {
         */
        ImageOutputStream imageOutputStream;
        /*
         * public interface ImageOutputStream extends ImageInputStream, DataOutput {
         */
    }
}
