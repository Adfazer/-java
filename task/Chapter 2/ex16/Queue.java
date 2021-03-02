import java.util.LinkedList;

public class Queue {
    Node node;

    public Queue () {
        node = new Node();
    }

    public void add(String str) {
        node.linkedList.addLast(str);
    }

    public void remove() {
        node.linkedList.removeFirst();
    }

    public void display() {
        System.out.println(node.linkedList.toString());
    }

    private static class Node {
        LinkedList<String> linkedList;

        public Node() {
            linkedList = new LinkedList<>();
        }
    }
}
