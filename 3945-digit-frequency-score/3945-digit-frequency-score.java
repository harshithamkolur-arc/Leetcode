class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        while(n != 0){
            int val = n % 10;
            n /= 10;
            if(map.containsKey(val)) map.put(val,map.get(val)+1);
            else map.put(val,1);
        }
        for(HashMap.Entry<Integer,Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            ans += key * val;
        }
        return ans;
    }
}