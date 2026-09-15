class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            String mapKey = getSortedString(s);
            List<String> newList = (List<String>) map.getOrDefault(mapKey, new ArrayList<String>());
            newList.add(s);
            map.put(mapKey, newList);
        }

        return new ArrayList<List<String>>(map.values());
    }

    private String getSortedString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}