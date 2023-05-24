package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Test11 {


    public static List<LocalDate> getAscDateList(LocalDate startDate, LocalDate endDate) {
        List<LocalDate> result = new ArrayList<>();
//        4、int compareTo(ChronoLocalDate other)
//        比较两个日期A.compareTo(B)，若日期相同则返回0；
//        若A>B，则返回1；
//        若A<B，则返回-1；
//        LocalDate l = LocalDate.parse("2021-11-29");
//        System.out.println(l.compareTo(LocalDate.parse("2021-11-28"))); //1
//        System.out.println(l.compareTo(LocalDate.parse("2021-11-30"))); //-1
//        System.out.println(l.compareTo(l)); //0

        if(endDate.compareTo(startDate) < 0 ){
            return  result;
        }
        while (true){
            result.add(startDate);
            if(startDate.compareTo(endDate) >= 0){
                break;
            }
            //LocalDate plusDays(long daysToAdd)	返回增加了*天的LocalDate副本
            startDate = startDate.plusDays(1);
        }
        return result;
    }
    public static void main(String[] args) {
        List<LocalDate> list=getAscDateList(LocalDate.parse("2021-12-11"),LocalDate.parse("2021-12-15"));
        for(LocalDate date:list){
            System.out.println(date.toString());
        }

//    List<String> list=getBetweenDate("2021-12-11","2021-12-15");
//        for(String date:list){
//        System.out.println(date);
//    }
    }


    public static List<String> getBetweenDate(String startTime, String endTime) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 声明保存日期集合
        List<String> list = new ArrayList<String>();
        try {
            // 转化成日期类型
            Date startDate = sdf.parse(startTime);
            Date endDate = sdf.parse(endTime);

            //用Calendar 进行日期比较判断
            Calendar calendar = Calendar.getInstance();
            while (startDate.getTime() <= endDate.getTime()) {
                // 把日期添加到集合
                list.add(sdf.format(startDate));
                // 设置日期
                calendar.setTime(startDate);
                //把日期增加一天
                calendar.add(Calendar.DATE, 1);
                // 获取增加后的日期
                startDate = calendar.getTime();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return list;
    }



}
