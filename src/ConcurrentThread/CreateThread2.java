package ConcurrentThread;
/**
 * 1. 通过继承Thread类，重写run方法；
 * 2. 通过实现runable接口；
 * 3. 通过实现callable接口这三种方式，下面看具体demo。
 * */
public class CreateThread2 {
    public static void main(String[] args) {
        //1.继承Thread
        for (int i = 0; i < 10; i++) {
            ExtendsThread2 thread2=new ExtendsThread2();
//            与继承Thread类相比，MyThread类在结构上没有区别，除了一点，如果继承了Thread类，同时也直接继承了start方法()，
//            但是如果实现的是我们Runnable接口，并没有start方法可以调用。
//            不管何种情况下，要想启动多线程，一定依靠Thread类完成，Thread类定义有以下构造方法。
            Thread result=new Thread(thread2);
            result.start();
        }
    }
}

class ExtendsThread2 implements Runnable{
    //private volatile  int i = 0;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }
}

