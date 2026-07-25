class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        
        neg_stones = [-stone for stone in stones]
        heapq.heapify(neg_stones)
    
        while len(neg_stones) > 1 :
            heavist = heapq.heappop(neg_stones)
            sec_heavist =  heapq.heappop(neg_stones)
            if sec_heavist > heavist:
                new_rock = heavist-sec_heavist
                heapq.heappush(neg_stones,new_rock)
        
        neg_stones.append(0)
              
        return abs(neg_stones[0])








        

        