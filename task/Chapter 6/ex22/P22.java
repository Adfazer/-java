/*
 * Усовершенствуйте метод p u b l i c s t a t i c <V, Т> V d o W o r k ( C a lla b le < V > с, T ex)
 * t h ro w s T, представленный в разделе 6.6.7, таким образом, чтобы передавать ему
 * объект исключения, который вряд ли будет вообще использован. Вместо этого
 * данный метод должен принимать ссылку на класс исключения.
 */

import java.util.concurrent.Callable;

public class P22 {
    public static void main(String[] args) {

    }

//    public static <V, T> V doWork(Callable<V> с, T ex) throws T {
//        try {
//            return с.call ();
//        } catch (Throwable realEx) {
//            ex.initCause(realEx);
//            throw ex;
//        }
//    }

}
