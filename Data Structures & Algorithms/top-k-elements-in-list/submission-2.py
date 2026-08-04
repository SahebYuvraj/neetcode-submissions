class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        counter = defaultdict(int)

        for num in nums:
                counter[num] += 1

        ranks = list(counter.items())
        ranks.sort(key=lambda x: x[1],reverse=True)
        return [ ranks[i][0] for i in range(k)]

