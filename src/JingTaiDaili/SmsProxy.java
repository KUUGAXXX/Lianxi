package JingTaiDaili;

public class SmsProxy implements Smsservice {
    private final Smsservice smsservice;
    public SmsProxy(Smsservice smsservice){
        this.smsservice=smsservice;
    }
    public String send(String message){
        //调用方法之前，我们可以添加自己的操作
        System.out.println("before method send()");
        smsservice.send(message);
        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("after method send()");
        return null;
    }
}
