package test;

import java.util.ArrayList;
import java.util.List;

public class Demo55 {
    public static void main(String[] args) {
        List<Stone> stoneList = new ArrayList<Stone>();
        Stone result1=new Stone();
        result1.setWeight(300);

        Stone result2=new Stone();
        result2.setWeight(400);

        Stone result3=new Stone();
        result3.setWeight(600);

        stoneList.add(result1);
        stoneList.add(result2);
        stoneList.add(result3);
        for (Stone s : stoneList) {
            if (s.getWeight() < 500) {
                stoneList.add(s);
            }
        }
        for (Stone s : stoneList) {
            System.out.println(s.getWeight());
        }
        }
    }

