package ConcurrentThread;
/**
 * 1. 通过继承Thread类，重写run方法；
 * 2. 通过实现runable接口；
 * 3. 通过实现callable接口这三种方式，下面看具体demo。
 * */
public class CreateThread1 {
    public static void main(String[] args) {
        //1.继承Thread
        for (int i = 0; i < 10; i++) {
            ExtendsThread1 thread1=new ExtendsThread1();
            thread1.start();
        }

    }
}
class ExtendsThread1 extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
