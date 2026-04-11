class Solution {
    public int findMin(int[] nums) {
        // simple check the middle say 5 if 5> 2 we are in the rotated part
        //check from num of 5+1 to end 
        // assume mid is smaller 4< 6 we can check only the first half

        int min = 0;
        int max = nums.length-1;

        while(min<max){
            int m = (min+max)/2;
            if(nums[m] > nums[max]){
                min = m+1;
            }
            else {
                max = m;
            }
        }
        return nums[min];
    }
}
