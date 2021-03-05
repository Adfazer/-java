/*
 * Допустим, что в методе I tern, e q u a l s (), представленном в разделе 4.2.2, ис-
 * пользуется проверка с помощью операции i n s t a n c e o f . Реализуйте метод
 *
 * D is c o u n t e d lt e m . e q u a ls () таким образом, чтобы выполнять в нем сравнение
 * только с суперклассом, если его параметр o t h e r O b j e c t относится к типу Item ,
 * но с учетом скидки, если эго тип D is c o u n t e d lt e m . Продемонстрируйте, что
 * этот метод сохраняет симметричность, но не транзитивность, т.е. способность
 * обнаруживать сочетание товаров по обычной цене и со скидкой, чтобы делать
 * вызовы х. e q u a ls (у) и у . e q u a ls (z ), но не х . e q u a ls ( z ???????????????
 */

public class Prog6 {
    public static void main(String[] args) {
        Item item = new DiscountedItem("first", 11, 10);
        DiscountedItem discountedItem = new DiscountedItem("first", 11, 10);
        Item item1 = new Item("first", 11);
        System.out.println(item.equals(discountedItem));
        System.out.println(item.equals(item1));
    }
}
