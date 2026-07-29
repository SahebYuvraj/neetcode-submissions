class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        #[1,2,3,2,2]
        slow_ptr = 0
        fast_ptr = 0

        slow_ptr = nums[0] #1
        fast_ptr =nums[nums[0]] #2

        #phase1
        while slow_ptr != fast_ptr:
            slow_ptr = nums[slow_ptr] #2
            fast_ptr = nums[nums[fast_ptr]] #2

        new_ptr = 0

        while slow_ptr != new_ptr:
            slow_ptr = nums[slow_ptr] # 1 #2
            new_ptr = nums[new_ptr] # 3 # 2

        return new_ptr #2
            