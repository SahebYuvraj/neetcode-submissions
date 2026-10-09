class Solution:
    def rob(self, nums: List[int]) -> int:

        if len(nums) == 1:
            return nums[0]
        
        elif len(nums) == 2:
            return max(nums[0],nums[1])


        def subarray(robbed:list) -> int:
            length = len(robbed) - 2
            robbed.extend([0,0])

            for i in range(length, -1, -1):
                robbed[i] = robbed[i] + max(robbed[i+2], robbed[i+3])
            
            print(max(nums[0],nums[1]))
            return(max(robbed[0],robbed[1]))


        return max(subarray(nums[0:-1]), subarray(nums[1::]))
    

        