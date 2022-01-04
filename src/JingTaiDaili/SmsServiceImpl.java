package JingTaiDaili;

public class SmsServiceImpl implements Smsservice{
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
