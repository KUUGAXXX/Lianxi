package LeetCode;

public class Code153 {
    public static int findMin(int[] nums) {
        int min=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,4,5,1,2};
        int result=findMin(nums);
        System.out.println(result);
    }
}
