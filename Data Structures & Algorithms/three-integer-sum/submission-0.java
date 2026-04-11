class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int z=j+1;z<nums.length;z++){
                    if(nums[i]+nums[j]+nums[z] == 0){
                        List<Integer> tmp = Arrays.asList(nums[i],nums[j],nums[z]);
                        set.add(tmp);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
