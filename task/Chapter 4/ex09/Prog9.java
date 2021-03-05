import java.lang.reflect.Field;

public class Prog9 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Example example = new Example();
        System.out.println(example.toString());

        Field f = Example.class.getDeclaredField("string");
        f.setAccessible(true);
        String fieldValue = (String)f.get(example).toString();
        System.out.println(fieldValue);

        Field q = Example.class.getDeclaredField("value");
        q.setAccessible(true);
        String fieldValue1 = (String)q.get(example).toString();
        System.out.println(fieldValue1);

        Field w = Example.class.getDeclaredField("open");
        w.setAccessible(true);
        String fieldValue2 = (String)w.get(example).toString();
        System.out.println(fieldValue2);

        Field s = Example.class.getDeclaredField("speed");
        s.setAccessible(true);
        String fieldValue3 = (String)s.get(example).toString();
        System.out.println(fieldValue3);
    }
}
