class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String sortedWord = new String(letters);
            if(!group.containsKey(sortedWord)){
                group.put(sortedWord, new ArrayList<>());
            }
            group.get(sortedWord).add(word);
           
        }
        return new ArrayList<>(group.values());

    }
}
