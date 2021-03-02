/**
 * Реализуйте полностью класс Invoice, представленный в разделе 2.6.1. Предо-
 * ставьте метод, выводящий счет-фактуру, и демонстрационную версию про-
 * ф а ммы, составляющей и выводящей образец счета-фактуры.
 */

public class Program015 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addltem("test", 15, 1.9);
        invoice.display();
    }
}
