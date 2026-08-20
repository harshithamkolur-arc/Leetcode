class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : sentence.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map.size());
        if(map.size() == 26) return true;
        return false;
    }
}