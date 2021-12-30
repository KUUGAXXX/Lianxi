package Jianzhioffer;

public class Code3 {
    public static void main(String[] args) {
        int arr[]=new int[]{3, 4, 2, 0, 0, 1,2,1,4,5};
       int  result=findRepeatNumber(arr);
        System.out.println(result);
    }
    public static int findRepeatNumber(int[] nums) {
        int length=nums.length;
        int i=0;
        int j=0;
        for ( i = 0; i < length-1; i++) {
            for ( j = i+1; j < length-1; j++) {
                if(nums[i]==nums[j]){
                    break;
                }
            }
            if(nums[i]==nums[j]){
                break;
            }
        }
        return nums[i];
    }
}
