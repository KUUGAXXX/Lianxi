package JingTaiDaili;

public class Main {
    public static void main(String[] args) {
        Smsservice smsservice=new SmsServiceImpl();
        SmsProxy smsProxy=new SmsProxy(smsservice);
        smsProxy.send("java");
    }
}
