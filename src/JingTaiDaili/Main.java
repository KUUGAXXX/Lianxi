package JingTaiDaili;

public class Main {
    public static void main(String[] args) {
        Smsservice smsservice=new SmsServiceImpl();
        SmsProxy smsProxy=new SmsProxy(smsservice);
        smsProxy.send("java");
    }
}
/**
 * 2. 静态代理
 *         静态代理中，我们对目标对象的每个方法的增强都是手动完成的（后面会具体演示代码），非常不灵活（比如接口一旦新增加
 *         方法，目标对象和代理对象都要进行修改）且麻烦(需要对每个目标类都单独写一个代理类)。 实际应用场景非常非常少，日常
 *         开发几乎看不到使用静态代理的场景。
 *
 *         上面我们是从实现和应用角度来说的静态代理，从 JVM 层面来说， 静态代理在编译时就将接口、实现类、代理类这些都变成
 *         了一个个实际的 class 文件。
 *
 *         静态代理实现步骤:
 *
 *         定义一个接口及其实现类；
 *         创建一个代理类同样实现这个接口
 *         将目标对象注入进代理类，然后在代理类的对应方法调用目标类中的对应方法。这样的话，我们就可以通过代理类屏蔽对目标
 *         对象的访问，并且可以在目标方法执行前后做一些自己想做的事情。
 */

