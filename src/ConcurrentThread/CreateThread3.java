package ConcurrentThread;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * 1. 通过继承Thread类，重写run方法；
 * 2. 通过实现runable接口；
 * 3. 通过实现callable接口这三种方式，下面看具体demo。
 * */
public class CreateThread3 {
    public static void main(String[] args) {
        //1.继承Thread
        for (int i = 0; i < 10; i++) {
            ExtendsThread3 thread3=new ExtendsThread3();
//            1】创建Callable接口的实现类，并实现call()方法，然后创建该实现类的实例（从java8开始可以直接使用Lambda表达式创建Callable对象）。
//            2】使用FutureTask类来包装Callable对象，该FutureTask对象封装了Callable对象的call()方法的返回值
//            3】使用FutureTask对象作为Thread对象的target创建并启动线程（因为FutureTask实现了Runnable接口）
//            4】调用FutureTask对象的get()方法来获得子线程执行结束后的返回值
            FutureTask<String> futureTask=new FutureTask<>(thread3);
            Thread result=new Thread(futureTask);
            result.start();

        }
    }
}

class ExtendsThread3 implements Callable<String> {
    @Override
public String call(){
        String result=Thread.currentThread().getName();
        System.out.println(Thread.currentThread().getName());
        return result;
    }

}

