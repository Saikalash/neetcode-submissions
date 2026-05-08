class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        List<List<String>> l =new ArrayList<>();
        HashMap<String,List<String>> h =new HashMap<>();
        for(String k:s)
        {
            char c[] =k.toCharArray();
            Arrays.sort(c);
            String m = new String(c);
            if(!h.containsKey(m))
            {
                h.put(m,new ArrayList<>());
            }
            h.get(m).add(k);
        }
        return new ArrayList<>(h.values());
    }
}
