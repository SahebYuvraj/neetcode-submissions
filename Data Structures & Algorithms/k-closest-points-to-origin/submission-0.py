X1 = 0
Y1 = 0

class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        max_heap = []
        for x,y in points:
            distance = (X1 - x)**2 + (Y1 - y)**2
            heapq.heappush(max_heap,(-distance, x,y))
            if len(max_heap) > k:
                heapq.heappop(max_heap)
        
        res = []
        for point in max_heap:
            distance, x,y = point
            res.append([x,y])
        
        return res

    def Euclidean_distance(self,x1:int, y1:int,x2:int, y2:int) -> float:
        return math.sqrt((x1 - x2)**2 + (y1 - y2)**2)

