
class Solution {
    
    public int binary_search(int[] nums, int target, int l, int r) {
       if(l>r) return -1;
       int m = l+(r-l)/2;
        if (nums[m] == target) return m;
        return(nums[m]<target)? binary_search(nums,target,m+1,r):
        binary_search(nums,target,l,m-1);
        
    }
    public int search(int nums[],int target){
        return binary_search(nums,target,0,nums.length -1);
    }
}
