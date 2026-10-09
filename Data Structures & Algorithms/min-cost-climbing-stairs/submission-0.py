class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        
        steps = [cost[-1], cost[-2]]
        print(steps)
        counter = 0
        for i in range(2,len(cost)):
            price = cost[len(cost)-i-1]
            print(steps[i-2],steps[i-1])
            steps.append( min( (price + steps[i-2]), (price + steps[i-1])))
           

        return min(steps[-1],steps[-2])
