import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        while((line=bf.readLine())!=null)
        {
            String[] arr=line.split(" ");
            int a=Integer.parseInt(arr[0]);
            int b=Integer.parseInt(arr[1]);

            String line1=bf.readLine();
            String[] arr1=line1.split(" ");
            int[] grade=new int[a];
            for(int i=0;i<a;i++)
            {
                grade[i]=Integer.parseInt(arr1[i]);
            }

            for(int i=1;i<b;i++)
            {
                String line2=bf.readLine();
                String[] arr2=line1.split(" ");
                if(arr2[0]=="U")
                {
                    grade[Integer.parseInt(arr[2])-1]=Integer.parseInt(arr2[4]);
                }
                if(arr2[0]=="Q")
                {
                    int max;
                    max=getmax(grade);
                    System.out.println(max);
                }
            }
        }
    }
    public static int getmax(int[] grade)
    {
        int max=grade[0];
        for(int i=1;i<grade.length;i++)
        {
            if(grade[i]>max)
                max= grade[i];

        }
        return max;
    }
}