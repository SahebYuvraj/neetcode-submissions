class Solution:
    def uniquePaths(self, m: int, n: int) -> int:

        row = [1]*n

        for i in range(m-1):

            new_rows = [1]*n
            for i in range(n-2,-1,-1):
                new_rows[i] = new_rows[i+1] + row[i]
            row = new_rows
        
        return row[0]
