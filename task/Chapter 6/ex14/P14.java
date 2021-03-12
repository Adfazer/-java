/*
 * Реализуйте усовершенствованный вариант метода c l o s e A l l (), представленно-
 * го в разделе 6.3. Закройте все элементы даже в том случае, если некоторые из
 *
 * них генерируют исключение. В таком случае сгенерируйте исключение впо-
 * следствии. Если исключение генерируется в результате двух или больше вызо-
 * вов данного метода, свяжите их в цепочку.
 */

import java.util.ArrayList;

public class P14 {
    public static void main(String[] args) {

    }

    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception {
        Exception ex = new Exception();

        for (T elem : elems) {
            try {
                elem.close();
            } catch (Exception e) {
                ex.addSuppressed(e);
            }
        }
        if (ex.getMessage() != null) {
            throw ex;
        }
    }
}
