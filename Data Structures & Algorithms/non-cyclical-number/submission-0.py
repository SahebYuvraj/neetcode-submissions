class Solution:
    def isHappy(self, n: int) -> bool:
        
        if n == 1:
            return True

        seen = set()
        seen.add(n)
        
        while n != 1:
            num = 0
            while n > 0:
                num += math.pow(n%10,2)
                n = n//10
            print(num)
            if num not in seen:
                seen.add(num)
            else:
                return False

            n = num
            print(n)
        return True
            
                

    