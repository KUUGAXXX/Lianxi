package HotCode;

import java.util.HashMap;
import java.util.Stack;

public class Code20 {
    public static void main(String[] args) {
        String s="{()}";
    }

    public boolean isValid(String s) {

        HashMap<Character,Character> pairs=new HashMap<>();
        pairs.put('{','}');
        pairs.put('[',']');
        pairs.put('(',')');

        int length=s.length();
        if(length%2!=0){
         return false;
        }else {
            Stack<Character> stack=new Stack<>();
            for (int i = 0; i < length; i++) {
                char ch = s.charAt(i);
                if(pairs.containsKey(ch)){
                    
                }
            }
        }

    }
}
