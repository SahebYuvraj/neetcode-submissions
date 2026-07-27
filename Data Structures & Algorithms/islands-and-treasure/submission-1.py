
from collections import deque

class Solution:
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:
        # i think this needs to be a bfs search 
        # i+1 is right, i-1 is left, j+1 is up and j-1 is right 
        directions = [[1,0],[0,1],[-1,0],[0,-1]]
        ROWS ,COLS = len(grid),len(grid[0])
        seen = set()
        q = deque()
        
        def addCell(r,c):
            if (r >= ROWS or c >= COLS or min(r,c) < 0 or (r,c) in seen or
                grid[r][c] == -1):
                return
            seen.add((r,c))
            q.append((r,c))
            

        #identify all the gates
        for r in range(ROWS):
            for c in range(COLS):
                if grid[r][c] == 0:
                    q.append((r,c))
                    seen.add((r,c))

        dist = 0
        while q:
            for i in range(len(q)):
                r,c = q.popleft()
                grid[r][c] = dist
                addCell(r+1,c)
                addCell(r-1,c)
                addCell(r,c+1)
                addCell(r,c-1)

            dist +=1



            




        