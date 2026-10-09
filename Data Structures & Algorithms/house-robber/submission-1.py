class Solution:
    def rob(self, nums: List[int]) -> int:
        # if i rob i i can only do i+2 or i+3

        # very similarly we go back

        if len(nums) == 1:
            return nums[0]
        elif len(nums) == 2:
            return max(nums[0],nums[1])

        else:
            length = len(nums)-2
            nums.extend([0,0])
            for i in range(length,-1,-1):
                nums[i] = max((nums[i]+nums[i+2]),(nums[i]+nums[i+3]))
            return max(nums[0],nums[1])


        