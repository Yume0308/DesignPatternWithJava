public class Client {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new MThread.ThreadFoo());
        Thread threadBar = new Thread(new MThread.ThreadBar());
        threadFoo.start();
        threadBar.start();
    }
}
