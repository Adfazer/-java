/*
 * Сравните вызов O b j e c t s . r e q u ir e N o n N u ll (o b j ) с утверждением a s s e r t o b j ! =
 * n u l l . Приведите убедительные примеры применения того и другого.
 */

import java.util.Objects;

public class Pr11 {
    public static void main(String[] args) {
        Object obj = null;
        assert obj != null;
        Objects.requireNonNull(obj);
    }
}
