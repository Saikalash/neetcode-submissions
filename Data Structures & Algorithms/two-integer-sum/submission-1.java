class Solution {
    public int[] twoSum(int[] a, int x) {
        HashMap<Integer,Integer> h  =new HashMap<Integer,Integer>();
        int n =a.length;
        int q[] =new int[2];
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(x-a[i]))
            {
                 return new int[] {h.get(x-a[i]),i};
            }
            else
            {
                h.put(a[i],i);
            }
        }
        return new int[] {};
    }
}
