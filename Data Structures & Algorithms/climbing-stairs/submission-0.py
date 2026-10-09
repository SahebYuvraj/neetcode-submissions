class Solution:
    def climbStairs(self, n: int) -> int:
        
        ways = [1,2]

        if n <= 2:
            return n

        for i in range(3,n+1):
            ways.append(ways[i-2]+ways[i-3])
        
        return ways[-1]
