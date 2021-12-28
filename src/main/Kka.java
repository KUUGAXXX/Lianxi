package main;
import java.util.HashMap;

/**
 * 36进制与10进制转换思路：
 *      一、创建HashMap类型对象用于存放数字'0'到字母'Z'36个字符值键对
 *      二、
 * @author Administrator
 *
 */
public class Kka {
    //定义36进制数字
    private static final String X36 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //拿到36进制转换10进制的值键对
    private static HashMap<Character, Integer> thirysixToTen = createMapThirtysixToTen();
    //拿到10进制转换36进制的值键对
    private static HashMap<Integer,Character> tenToThirtysix = createMapTenToThirtysix();
    //定义静态进制数
    private static int BASE = 36;
    //用来存放10转36进制的字符串
    private static StringBuffer sb = new StringBuffer();

    private static HashMap<Character, Integer> createMapThirtysixToTen() {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < X36.length(); i++) {
            //0--0,... ..., Z -- 35的对应存放进去
            map.put(X36.charAt(i), i);
        }
        return map;
    }

    private static HashMap<Integer, Character> createMapTenToThirtysix() {
        HashMap<Integer, Character> map = new HashMap<Integer,Character>();
        for (int i = 0; i < X36.length(); i ++) {
            //0--0,... ..., 35 -- Z的对应存放进去
            map.put(i, X36.charAt(i));
        }
        return map;
    }

    /** 36 to 10
     * @param pStr 36进制字符串
     * @return  十进制
     */
    public static int ThirtysixToDeciaml(String pStr) {
        if (pStr == "") return 0;
        //目标十进制数初始化为0
        int deciaml = 0;
        //记录次方,初始为36进制长度 -1
        int power = pStr.length() - 1;
        //将36进制字符串转换成char[]
        char[] keys = pStr.toCharArray();
        for (int i = 0; i < pStr.length(); i++) {
            //拿到36进制对应的10进制数
            int value = thirysixToTen.get(keys[i]);
            deciaml = (int) (deciaml + value*Math.pow(BASE, power));
            //执行完毕 次方自减
            power --;
        }
        return deciaml;
    }

    /**10 to 36
     * @param iSrc  10进制整数值
     * @param pRet  将iSrc转换成36进制以后的字符串
     * @return  0成功，其他失败
     */
    public static int DeciamlToThirtySix(int iSrc, String pRet) {
        String str = DeciamlToThirtySix(iSrc);
        if (str.equals(pRet)) {
            return 0;
        } else {
            return 1;
        }
    }

    /**
     * 用递归来实现10 to 36
     * @param iSrc
     * @return
     */
    public static String DeciamlToThirtySix(int iSrc) {
        //循环控制
        boolean flag = true;
        //定义键
        int key;
        //定义值
        int value;
        while (flag) {
            key = iSrc / BASE;
            value = iSrc - key*BASE;
            if (key == 0) {
                flag = false;
                sb.append(tenToThirtysix.get(value).toString());
            } else if (key != 0) {
                //如果value小于进制36，说明下次递归会执行上面的语句
                //而这次的循环还没有终止，所以要讲循环控制设置为false;
                if (value < BASE) flag = false;
                sb.append(tenToThirtysix.get(key).toString());
                DeciamlToThirtySix(value);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int x = ThirtysixToDeciaml("-sgsf");
        String s = DeciamlToThirtySix(100);
        System.out.println(s);
    }
}