package ConcurrentThread;

public class CreateTest1 {
    public static void main(String[] args) {
        //1.继承Thread
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("继承Thread");
                super.run();
            }
        };
        thread.start();
    }
}
