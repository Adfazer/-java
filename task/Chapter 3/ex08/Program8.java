/*
 * Создайте класс G r e e t e r , реализующий интерфейс R u n n a b le , метод которого
 *
 * ru n () выводит п раз сообщение " H e l l o , " + t a r g e t , где п и t a r g e t — параме-
 * тры, устанавливаемые в конструкторе. Получите два экземпляра этого класса с
 *
 * разными сообщениями и выполните их параллельно в двух потоках.
 */

public class Program8 {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(new Greeter(((Object)i).toString()));
            thread.start();
        }
    }
}
