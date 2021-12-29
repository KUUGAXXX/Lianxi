package HotCode;

public class Code1 {
    public static void main(String[] args) {
        int nums[] = {3,2,4};
        int target = 6;
        int arr[]=new int[2];
        arr=Code1.twoSum(nums,target);
        System.out.println(arr);

    }
    public static int[] twoSum(int[] nums, int target) {
        int size =nums.length;
        int i,j=0;
        int result[]=new int[2];
        for( i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(target==nums[i]+nums[j]){
                    result=new int[]{i,j};
                }
            }
        }
        return result;
    }
}
