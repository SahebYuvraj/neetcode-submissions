
DIRECTIONS = [(1,0),(0,-1),(-1,0),(0,1)]

class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        #single rotten -> 0
        # if no rotten 
        q = collections.deque()
        fresh = 0

        for row in range(len(grid)):
            for col in range(len(grid[0])):
                if grid[row][col] == 2:
                    q.append((row,col))
                    
                if grid[row][col] == 1:
                    fresh += 1
                
        
        #q is now contains all the rotten fruits 

        minute = 0

        while q and fresh > 0:
            for i in range(len(q)):
                row, col = q.popleft()

                for x,y in DIRECTIONS:
                    r,c = row+x, col+y
                
                    if (r in range(len(grid))) and (c in range(len(grid[0])) and grid[r][c] == 1):
                        grid[r][c] = 2
                        q.append((r,c))
                        fresh -= 1

            minute += 1

        return minute if fresh == 0 else -1 

        





              
            





