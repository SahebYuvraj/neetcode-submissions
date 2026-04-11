class Solution {
    public int lengthOfLongestSubstring(String s) {
        //this can be done in n make a hashmap and then return length
        // in a sliding window is to find the longest substring so lets keep moving right the same way to find a section.
        HashSet<Character> un = new HashSet<>();
        // instead of letters we need to keep substring and then return the length of the longest one

        int l = 0;
        int longestsub = 0;

        for(int r =0; r<s.length();r++){
            while(un.contains(s.charAt(r))){
                un.remove(s.charAt(l));
                l++;
            }
            un.add(s.charAt(r));
            longestsub = Math.max(longestsub,r-l+1);

        }
        return longestsub;

        

    }
}
