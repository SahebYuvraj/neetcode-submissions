class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        grps = {}

        for word in strs:
            sorted_word = "".join(sorted(word))
            if sorted_word in grps:
                grps[sorted_word].append(word)
            else:
                grps[sorted_word] = [word]

        return [words for words in grps.values()]

            
