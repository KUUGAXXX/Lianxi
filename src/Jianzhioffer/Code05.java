package Jianzhioffer;

public class Code05 {
    public String replaceSpace(String s) {
        StringBuilder result=new StringBuilder();
        for (char ch:s.toCharArray()) {
            if(ch==' '){
                result.append("%20");
            }
            else
            {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
