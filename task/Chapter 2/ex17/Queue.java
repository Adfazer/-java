import java.util.LinkedList;

public class Queue {
    Node node;
    Iterator iterator;

    public Queue () {
        node = new Node();
        iterator = new Iterator();
    }

    public Iterator iterator() {
        return iterator;
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

    public class Iterator {
        private int i;

        public Iterator() {
            i = 0;
        }

        public boolean hasNext() {
            return node.linkedList.size() > i;
        }

        public String next() {
            return node.linkedList.get(i++);
        }
    }

    private static class Node {
        LinkedList<String> linkedList;

        public Node() {
            linkedList = new LinkedList<>();
        }
    }
}
