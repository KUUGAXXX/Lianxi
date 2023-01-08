package test;


/**
 * 下划线转驼峰
 * */
public class Tuofeng {
    public static void main(String[] args) {
        final String personCheckField = "address,in_time_kkk,out_time,content,company,duty_class,check_person_name,deleted,creator,create_time,updater,update_time,signature,source_type";

        StringBuffer buffer =new StringBuffer();
        for(String s:personCheckField.split(",")){
            String[] s1=s.split("_");
            for (int i = 0; i < s1.length; i++) {
                if(i==0)buffer.append(",").append(s1[i]);
                else {
                    char change1=(char)(s1[i].charAt(0)-32);
                    String change2=s1[i].substring(1);
                    buffer.append(change1).append(change2);

                }
            }
        }
        System.out.println(buffer);
    }
}
