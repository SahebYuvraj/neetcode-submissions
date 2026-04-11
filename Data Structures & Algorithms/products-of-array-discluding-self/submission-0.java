class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int num = 1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    num*= nums[j];
                }
            }
            result[i] = num;
        }
        return result;
    }
}  
