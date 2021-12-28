package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Maain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            String long1=line.substring(1,(line.length()/2-1));//1,2,3,4
            String long2=line.substring((line.length()/2+2),(line.length()-1));

//            System.out.println(long1);
//            System.out.println(long2);
            String[] arr1=long1.split(",");
            String[] arr2=long2.split(",");
            int[] a=new int[100];
            int[] b=new int[100];
            for(int i=0;i<arr1.length;i++)
            {
                a[i]=Integer.parseInt(arr1[i]);
                b[i]=Integer.parseInt(arr2[i]);
            }
            int k1=getArea(a);
            int k2=getArea(b);
            int k3=k1*k2;
            System.out.println(k3);
        }
    }
    public static int getArea(int[] a)
    {
        if(a.length==1){
            return  0;
        }
        if(a.length==2)
        {
            return  a[1];
        }
        int k=a.length-1;
        int minHight=0;
        int area=0;
        for(int i=1;i<k;i++)
        {
            minHight=a[i];
            for(int n=i+1;n<=k;n++)
            {
                minHight=Math.min(minHight,a[n]);
                if(a[n]>area){area=a[i];}
                area=Math.max(area,(n-i+1)*minHight);
            }
        }
        return area;
    }
}
