public class Greeter implements Runnable{
    String target;

    public Greeter(String target) {
        this.target = target;
    }

    @Override
    public void run() {
        System.out.println("Hello, " + target);
    }
}
