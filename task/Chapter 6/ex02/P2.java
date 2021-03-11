public class P2 {
    public static void main(String[] args) {
        Stack2 stack = new Stack2();
        for (int i = 0; i < 40; i++) {
            System.out.println(stack.isEmpty());
            stack.push(i);
            System.out.println(stack.pop());
        }

        Stack stack1 = new Stack();
        for (int i = 0; i < 40; i++) {
            System.out.println(stack1.isEmpty());
            stack1.push(i);
            System.out.println(stack1.pop());
        }
    }
}
